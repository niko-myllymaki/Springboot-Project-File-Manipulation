package com.springboot.projects.springbootProject1.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.projects.springbootProject1.handler.PlayerHandler;
import com.springboot.projects.springbootProject1.model.Player;

@RestController
@RequestMapping(value = "project")
public class ProjectController {
	
	@RequestMapping(value = "/write")
	public String writingToFile() {
	  return PlayerHandler.writeToFile();
	}
	
	@RequestMapping(value = "/read")
	public List<String> readingFromFile() {
	  return PlayerHandler.readFromFile();
	}
	
	@RequestMapping(value = "/playerlist", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public List<Player> getPlayerList() {
		return PlayerHandler.getPlayerList();
	}
	
	@RequestMapping(value = "/add")
	public String addingNewPlayer(@RequestParam(value="name") String playerName, @RequestParam(value="score") double playerScore) {
	  return PlayerHandler.addNewPlayer(playerName, playerScore);
	}

}
