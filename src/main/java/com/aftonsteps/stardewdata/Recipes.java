package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

public class Recipes extends GameData {
	public Recipes(JSONParser parser, String filepath) {
        super(parser, 
        		filepath + "/CookingRecipes.json",
        		new String[] {
        				"Name",
        				"Ingredients",
        				"Unused",
        				"Yield Object Id",
        				"Unlock Conditions"});
        this.name = "Recipes";
		super.parseIds();
		super.parseContent(new int[] {}, new int[] {}, new int[] {}, "\\/");
	}
}
