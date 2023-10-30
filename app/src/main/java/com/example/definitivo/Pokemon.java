package com.example.definitivo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;


@Entity
public class Pokemon implements Serializable {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String ability;
    int height;
    int weight;
    String urlInfo;
    String image;

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(String urlInfo) {
        this.urlInfo = urlInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ability='" + ability + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", urlInfo='" + urlInfo + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
