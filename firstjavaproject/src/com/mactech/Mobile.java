package com.mactech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

//      Airtel airtel=new Airtel();
//      airtel.calling();
//      airtel.data();

      //suppose Vodaphone providing nice features in feauture so we need to change above code manually like this.
//      Vodaphone vodaphone=new Vodaphone();
//      vodaphone.calling();
//      vodaphone.data();

      //above both code we need to change class reference name every time,so we can use this is also.
//      Sim sim=new Vodaphone();
//      sim.calling();
//      sim.data();

//      Sim sim=new Airtel();
//      sim.calling();
//      sim.data();


//      but all above things also not sufficient, Suppose we are creating this app for a client and client says
//      make this app configurable you don't need to touch source code.The source code need to be fixed if you want
//      to make any changes make these changes outside the application .
//      so spring can solve this problem .

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Sim sim=context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
	}

}
