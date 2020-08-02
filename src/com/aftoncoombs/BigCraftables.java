package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class BigCraftables extends GameData {
    private int[] ids;
    private String[] enName;
    private int[] price;
    private int[] edibility;
    private String[] type;
    private int[] category;
    private String[] description;
    private boolean[] canBeSetOutdoors;
    private boolean[] canBeSetIndoors;
    private int[] fragility;
    private int[] isLamp;

    public BigCraftables(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Big Craftables";
        this.joinToObjectInfo = false;
        // TODO: Parse all the elements of content
    }
}
