package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Objects extends GameData {
    public Objects(JSONParser parser, String filepath, int[] splitIdx, int[] lengths) {
        super(parser, filepath, splitIdx, lengths);
        this.name = "Objects";
        this.joinToObjectInfo = false;
        this.colnames = new String[]{"ObjectId", "Name", "Price", "Edibility", "Category", "Type", "Display Name", "Description", "Food Drink Type", "Food Drink Buff", "Food Drink Buff Duration"};
    }
}
