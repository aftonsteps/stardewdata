package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class Crops extends GameData {
    public Crops(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Crops";
        this.joinToObjectInfo = true;
        this.content[0] = new String[]{"ObjectId", "Days In Each Stage Of Growth", "Growth Seasons", "Index In Sprite Sheet", "Index Of Harvest", "Regrow After Harvest", "Harvest Method", "Chance For Extra Harvest", "Raised Seeds", "Tint Color"};
    }
}
