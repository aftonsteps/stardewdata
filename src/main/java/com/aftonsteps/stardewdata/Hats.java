package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

// TODO fix column names

public class Hats extends GameData {
    public Hats(JSONParser parser, String filepath) {
        super(parser, filepath + "/hats.json", 5, 4);
        this.name = "Hats";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Description", "Skip Hair Draw", "Ignore Hairstyle Offset", "Prismatic"};
    }
}