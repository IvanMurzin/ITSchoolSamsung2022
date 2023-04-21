package ru.ivanmurzin.rickandmorty.model.response;

import java.util.Date;
import java.util.List;

public class Character {
    public int id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public Origin origin;
    public Location location;
    public String image;
    public List<String> episode;
    public String url;
    public Date created;
}
