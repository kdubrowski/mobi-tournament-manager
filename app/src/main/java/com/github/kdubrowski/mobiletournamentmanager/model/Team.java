package com.github.kdubrowski.mobiletournamentmanager.model;

/**
 * Created by dukr on 09/03/2017.
 */

public class Team {

    private String name;
    private String code;
    private String shortName;
    private double squadMarketValue;
    private String crestUrl;

    public Team() {
    }

    public Team(String name, String code, String shortName, double squadMarketValue, String crestUrl) {
        this.name = name;
        this.code = code;
        this.shortName = shortName;
        this.squadMarketValue = squadMarketValue;
        this.crestUrl = crestUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public double getSquadMarketValue() {
        return squadMarketValue;
    }

    public void setSquadMarketValue(double squadMarketValue) {
        this.squadMarketValue = squadMarketValue;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }
}
