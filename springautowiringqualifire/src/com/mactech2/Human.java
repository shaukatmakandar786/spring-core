package com.mactech2;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;

	/*
	 * //@Autowired public Human(Heart heart) {
	 * 
	 * this.heart = heart;
	 * 
	 * }
	 * 
	 * public Human() {
	 * 
	 * }
	 */
//@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method is called");
	}

	public void startPumping() {
		heart.pump();

	}

}
