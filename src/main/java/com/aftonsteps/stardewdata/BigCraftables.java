package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class BigCraftables extends GameData {
    public BigCraftables(JSONParser parser, String filepath) {
        super(parser, filepath + "/BigCraftablesInformation.json", new int[] {3}, new int[] {2});
        this.name = "Big Craftables";
        this.joinToObjectInfo = true;
        this.colnames = new String[]{"ObjectId", "Name", "Price", "Edibility", "Type", "Category", "Description", "Can be set outdoors", "Can be set indoors", "Fragility", "English Name"};
    }
}
