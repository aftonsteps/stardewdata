package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Furniture extends GameData {
    public Furniture(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Furniture";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Type", "Source Rectangle", "Bounding Box", "Rotations", "Price"};
    }
}
