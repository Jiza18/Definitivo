package com.example.definitivo;

public class Pokemon {
    String name;
    String skill;
    String power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
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
                ", skill='" + skill + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
