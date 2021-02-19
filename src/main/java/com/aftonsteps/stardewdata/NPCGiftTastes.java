package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

// TODO: Fix parsing failures

public class NPCGiftTastes extends GameData {

	public NPCGiftTastes(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/NPCGiftTastes.json", 
				new String[] {
						"ObjectId", 
						"Name", 
						"Price", 
						"Edibility", 
		        		"Type",
		        		"Category",
		        		"Display Name", 
		        		"Description"});
		this.name = "NPC Gift Tastes";
		super.parseIds(new String[] {
				"Robin", 
				"Demetrius",
				"Maru",
				"Sebastian",
				"Linus",
				"Pierre",
				"Caroline",
				"Abigail",
				"Alex",
				"George",
				"Evelyn",
				"Lewis",
				"Clint",
				"Penny",
				"Pam",
				"Emily",
				"Haley",
				"Jas",
				"Vincent",
				"Jodi",
				"Kent",
				"Sam",
				"Leah",
				"Shane",
				"Marnie",
				"Elliott",
				"Gus",
				"Dwarf",
				"Wizard",
				"Harvey",
				"Sandy",
				"Willy",
				"Krobus"
		});
		super.parseContent(new int[] {}, new int[] {}, new int[] {});
	}

}
