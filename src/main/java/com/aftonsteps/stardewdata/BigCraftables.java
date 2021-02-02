package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class BigCraftables extends GameData {
    public BigCraftables(JSONParser parser, String filepath) {
        super(parser, filepath + "/BigCraftablesInformation.json", new int[] {3, 10}, new int[] {2, 2}, 12, 10);
        this.name = "Big Craftables";
        this.joinToObjectInfo = true;
        this.colnames = new String[]{"ObjectId", "Name", "Price", "Edibility", "Type", "Category", "Description", "Can be set outdoors", "Can be set indoors", "Fragility", "Is Lamp", "English Name"};
    }
}
