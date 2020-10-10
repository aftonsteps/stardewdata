package com.aftoncoombs;
import org.json.simple.parser.JSONParser;

public class Hats extends GameData {
    public Hats(JSONParser parser, String filepath) {
        super(parser, filepath);
        this.name = "Hats";
        this.joinToObjectInfo = false;
        this.content[0] = new String[]{"Name", "Description", "SkipHairDraw", "IgnoreHairstyleOffset"};
    }
}