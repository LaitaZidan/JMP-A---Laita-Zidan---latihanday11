package com.firstapp.latihan_recyclerview;

public class TeamLogo {

    public String logo;
    public String name;

    public TeamLogo(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }


    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {

        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
