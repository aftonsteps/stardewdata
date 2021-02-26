package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class TrappedFish extends GameData {
    public TrappedFish(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Fish.json",
        		new String[] {
        				"Object Id",
        				"Name", 
        				"Type", 
        				"Chance", 
        				"Unused", 
        				"Location", 
        				"Min Size", 
        				"Max Size"});
        this.name = "TrappedFish";
		super.parseIds(new String[] {
				"372",
				"715",
				"716",
				"717",
				"718",
				"719",
				"720",
				"721",
				"722",
				"723"
		});
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
    }
}
