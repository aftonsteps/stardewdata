package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

// TODO fix furniture parsing warning

public class Furniture extends GameData {
    public Furniture(JSONParser parser, String filepath) {
        super(parser, filepath + "/furniture.json");
        this.name = "Furniture";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Type", "Source Rectangle", "Bounding Box", "Rotations", "Price"};
    }
}
