package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
	// Setup singletons
        JSONParser parser = new JSONParser();

        BigCraftables test = new BigCraftables(parser, "/Users/aftoncoombs/Projects/rstardew/data-raw/unpacked/BigCraftablesInformation.json");
        System.out.println(test.content[0][0]);
        test.writeToFile();
    }
}
