package com.aftonsteps.stardewdata;

import org.json.simple.parser.JSONParser;

// TODO: split type and category

public class SeedsObjectInformation extends GameData {
	public SeedsObjectInformation(JSONParser parser, String filepath) {
		super(parser, 
				filepath  + "/ObjectInformation.json", 
				new String[] {
						"ObjectId", 
						"Name", 
						"Sell Price", 
						"Edibility", 
						"Type",
						"Category",
        				"English Name", 
        				"English Description"
        				});
		this.name = "Seeds Object Information";
		super.parseIds(new String[] {
				"273",
				"299",
				"301",
				"302",
				"347",
				"425",
				"427",
				"429",
				"431",
				"433",
				"453",
				"455",
				"472",
				"473",
				"474",
				"475",
				"476",
				"477",
				"478",
				"479",
				"480",
				"481",
				"482",
				"483",
				"484",
				"485",
				"486",
				"487",
				"488",
				"489",
				"490",
				"491",
				"492",
				"493",
				"494",
				"495",
				"496",
				"497",
				"498",
				"499",
				"745",
				"770",
				"802"
		});
		super.parseContent(new int[] {3}, new int[] {2}, new int[] {}, "\\/");
	}
}
