package com.github.kdubrowski.mobiletournamentmanager.api;

import com.github.kdubrowski.mobiletournamentmanager.model.Team;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dukr on 09/03/2017.
 */

public interface FootballDataAPI {

    @GET("v1/teams")
    Call<List<Team>> getTeamByName(@Query(value = "name", encoded = true) String name);

}
