package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class BigCraftables extends GameData {

    public BigCraftables(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Big Craftables";
        this.joinToObjectInfo = false;
        this.content[0] = new String[]{"Name", "Price", "Edibility", "Type & Category", "Description", "Can be set outdoors", "Can be set indoors", "Fragility", "isLamp", "Name"};
    }
}
