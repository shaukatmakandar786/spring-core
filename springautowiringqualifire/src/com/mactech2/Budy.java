package com.mactech2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Budy {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Human human=context.getBean("human",Human.class);
		human.startPumping();	

	} 

}
