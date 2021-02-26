package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class CaughtFish extends GameData {
    public CaughtFish(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Fish.json",
        		new String[] {
        				"Object Id",
        				"Name", 
        				"Chance Of Darting", 
        				"Darting Randomness", 
        				"Min Size", 
        				"Max Size", 
        				"Min Time Of Spawn", 
        				"Max Time Of Spawn",
        				"Unused",
        				"Weather",
        				"Locations",
        				"Min Depth",
        				"Spawn Multiplier",
        				"Depth Multiplier",
        				"Min Fishing Level"});
        this.name = "CaughtFish";
		super.parseIds(new String[] {
				"128",
				"129",
				"130",
				"131",
				"132",
				"136",
				"137",
				"138",
				"139",
				"140",
				"141",
				"142",
				"143",
				"144",
				"145",
				"146",
				"147",
				"148",
				"149",
				"150",
				"151",
				"152",
				"153",
				"154",
				"155",
				"156",
				"157",
				"158",
				"159",
				"160",
				"161",
				"162",
				"163",
				"164",
				"165",
				"267",
				"269",
				"682",
				"698",
				"699",
				"700",
				"701",
				"702",
				"704",
				"705",
				"706",
				"707",
				"708",
				"734",
				"775",
				"795",
				"796",
				"798",
				"799",
				"800"
		});
		super.parseContent(new int[] {5}, new int[] {2}, new int[] {}, "\\/");
    }
}