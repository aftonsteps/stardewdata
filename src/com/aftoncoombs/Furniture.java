package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class Furniture extends GameData {
    public Furniture(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Furniture";
        this.joinToObjectInfo = false;
        this.content[0] = new String[]{"Name", "Type", "Source Rectangle", "Bounding Box", "Rotations", "Price"};
    }
}
