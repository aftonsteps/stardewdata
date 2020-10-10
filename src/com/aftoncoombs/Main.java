package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
	// Setup singletons
        JSONParser parser = new JSONParser();

        BigCraftables test =
                new BigCraftables(parser, "/Users/aftoncoombs/Projects/rstardew/data-raw/unpacked/BigCraftablesInformation.json", new int[] {3});
        test.writeToFile();

        Crops cropsTest = new Crops(parser, "/Users/aftoncoombs/Projects/rstardew/data-raw/unpacked/Crops.json");
        cropsTest.writeToFile();
    }
}
