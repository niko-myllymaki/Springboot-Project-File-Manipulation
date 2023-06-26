package com.springboot.projects.springbootProject1.handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.springboot.projects.springbootProject1.model.Player;

public class PlayerHandler {

	static List<Player> playerList = new ArrayList<>();
	
	static {
		playerList.add(new Player("Yellow", 1 , 55.5));
		playerList.add(new Player("Purple", 2 , 100.1));
		playerList.add(new Player("Green 3", 3 , 68.99));
	}
	
	public static List<Player> getPlayerList() {
		return playerList;
	}
	
	public static String writeToFile() {
		String result = "";
		//Default folder for writing files is the apache tomcat bin folder
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("players.txt"));
			
			for(Player player : playerList) {
				writer.write(player.toString() + "\n");
			}
			
			writer.close();
			result = "Writing done.";
		} catch (IOException e) {
			e.printStackTrace();
			result = "Writing not ok";
		}
		
		return result;
	}
	
	
	public static List<String> readFromFile() {
	    List<String> playersFromFile = new ArrayList<>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("players.txt"));
			String line;
			//loop through the file until null
			while((line = reader.readLine()) != null) {
				playersFromFile.add(line);
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return playersFromFile;
	}
	
	public static String addNewPlayer(String name, double score) {
		int NewId = playerList.size() + 1;
		playerList.add(new Player(name, NewId, score));
		return "Adding new player done";
	}
}
