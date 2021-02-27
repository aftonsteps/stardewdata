package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Monsters extends GameData {
	public Monsters(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/Monsters.json",
        		new String[] {
        				"Name",
        				"Health",
        				"Damage", 
        				"Min Coins To Drop (Unimplemented)",
        				"Max Coins To Drop (Unimplemented)",
        				"Flying",
        				"Duration Of Random Movements",
        				"Objects To Drop",
        				"Defense",
        				"Jitteriness",
        				"Distance Threshold For Moving Toward Player",
        				"Speed",
        				"Chance Of Attacks Missing",
        				"Mine Monster",
        				"Exerperience Gained",
        				"English Name"});
        this.name = "Monsters";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
	}
}
