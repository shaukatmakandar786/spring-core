package com.mactech1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exame {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Student shaukat=context.getBean("student1",Student.class);
		shaukat.displayStudentInfo();
		
		Student zahid=context.getBean("student2",Student.class);
		zahid.displayStudentInfo();
		
//		Student wa=context.getBean("student3",Student.class);
//		wa.displayStudentInfo();
		
		
	}

}
