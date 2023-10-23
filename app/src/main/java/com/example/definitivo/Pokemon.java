package com.example.definitivo;

public class Pokemon {
    String name;
    String ability;
    String power;
    String urlInfo;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(String urlInfo) {
        this.urlInfo = urlInfo;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", skill='" + ability + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
