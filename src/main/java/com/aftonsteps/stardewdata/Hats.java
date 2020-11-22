package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Hats extends GameData {
    public Hats(JSONParser parser, String filepath) {
        super(parser, filepath + "/hats.json", 5, 4);
        this.name = "Hats";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Description", "SkipHairDraw", "IgnoreHairstyleOffset", "Prismatic"};
    }
}