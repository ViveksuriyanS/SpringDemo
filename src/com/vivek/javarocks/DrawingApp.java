package com.vivek.javarocks;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args) {

//		Triangle tri = new Triangle();
//		tri.draw();

		// Other ways of instantiating an object

		// Since XMLBeanFactory is deprecated
		BeanFactory bean = new XmlBeanFactory(new FileSystemResource("spring.xml")); // Outside spring.xml
		Triangle tri = (Triangle) bean.getBean("triangle");
		tri.draw();

		// ApplicationContext is similar to BeanFactory with extra functionalities - AOP

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/spring.xml"); // Outside
																									// spring.xml
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();

		// Variable Injection
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("/spring.xml"); // Inside spring.xml
		Triangle triangle1 = (Triangle) applicationContext1.getBean("triangle");
		triangle1.draw();

		// Constructor Injection
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("/spring.xml"); // Inside spring.xml
		Triangle triangle2 = (Triangle) applicationContext2.getBean("triangleConstructor");
		triangle2.draw();

		// Constructor Injection1
		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("/spring.xml"); // Inside spring.xml
		Triangle triangle3 = (Triangle) applicationContext2.getBean("triangleConstructor1");
		triangle3.draw();

		// Object Injection
		ApplicationContext acRect = new ClassPathXmlApplicationContext("springrectangle.xml");
		AreaCalculator rect = (AreaCalculator) acRect.getBean("rectangle1");
		rect.area();
	}
}
