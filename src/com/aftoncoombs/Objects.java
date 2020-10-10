package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class Objects extends GameData {
    public Objects(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Rings";
        this.joinToObjectInfo = false;
        this.content[0] = new String[]{"Name", "Description", "SkipHairDraw", "IgnoreHairstyleOffset"};
    }
}
