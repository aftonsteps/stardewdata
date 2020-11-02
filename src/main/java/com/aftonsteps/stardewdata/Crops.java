package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Crops extends GameData {
    public Crops(JSONParser parser, String filepath, int[] splitIdx, int[] lengths) {
        super(parser, filepath, splitIdx, lengths);
        this.name = "Crops";
        this.joinToObjectInfo = true;
        this.content[0] = new String[]{"ObjectId", "Days in Stage 1 Growth", "Days in Stage 2 Growth",
                "Days in Stage 3 Growth", "Days in Stage 4 Growth", "Days in Stage 5 Growth", "Growth Seasons",
                "Index In Sprite Sheet", "Index Of Harvest", "Regrow After Harvest", "Harvest Method",
                "Chance For Extra Harvest", "Min Extra Harvest", "Max Extra Harvest",
                "Max Harvest Increase Per Farming Level", "Chance For Extra Crops", "Raised Seeds", "Tint Color"};
    }
}
