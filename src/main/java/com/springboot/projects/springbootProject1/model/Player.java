package com.springboot.projects.springbootProject1.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "product")

public class Player {

	private String name;
	private int id;
	private double score;
	
	public Player() {
		this.name = "Player name unknown";
		this.id = 0;
		this.score = 0.0;
	}
	
	public Player(String name, int id, double score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [name = " + name + ", id = " + id + ", score = " + score + "]";
	}
	
	
	
	
}
