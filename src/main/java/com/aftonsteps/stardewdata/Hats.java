package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Hats extends GameData {
    public Hats(JSONParser parser, String filepath, int contentLength, int nullIdx) {
        super(parser, filepath, contentLength, nullIdx);
        this.name = "Hats";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Description", "SkipHairDraw", "IgnoreHairstyleOffset", "Prismatic"};
    }
}