package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Weapons extends GameData {
    public Weapons(JSONParser parser, String filepath) {
        super(parser, filepath + "/weapons.json");
        this.name = "Weapons";
        this.joinToObjectInfo = true;
        this.colnames = 
        		new String[]{"ObjectId", "Name", "Description", "Min Damage Output", 
        				"Max Damage Output", "Knockback", "Speed", "Added Precision", 
        				"Added Defense", "Type", "Base Mine Level", "Min Mine Level", 
        				"Added Area Of Effect", "Critical Chance", "Critical Multiplier"};
    }
}
