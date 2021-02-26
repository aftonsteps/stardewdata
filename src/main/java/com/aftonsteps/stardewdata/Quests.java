package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Quests extends GameData {
    public Quests(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Quests.json",
        		new String[] {
        				"Id",
        				"Type", 
        				"Title", 
        				"Quest Details", 
        				"Hint Or Condition", 
        				"Solution Or Trigger", 
        				"Next Quest", 
        				"Gold", 
        				"Reward Description", 
        				"Cancelable"});
        this.name = "Quests";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
    }
}
