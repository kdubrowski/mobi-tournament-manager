package com.github.kdubrowski.mobiletournamentmanager.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.kdubrowski.mobiletournamentmanager.R;
import com.github.kdubrowski.mobiletournamentmanager.api.FootballDataAPI;
import com.github.kdubrowski.mobiletournamentmanager.model.Team;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.football-data.org").addConverterFactory(GsonConverterFactory.create()).build();
        final FootballDataAPI api = retrofit.create(FootballDataAPI.class);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Call<List<Team>> teams = api.getTeamByName("juve");
                teams.enqueue(new Callback<List<Team>>() {
                    @Override
                    public void onResponse(Call<List<Team>> call, Response<List<Team>> response) {
                        if (response.isSuccessful()) {
                            List<Team> foundTeams = response.body();
                        }

                    }

                    @Override
                    public void onFailure(Call<List<Team>> call, Throwable t) {
                        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });

            }
        });
    }

}
