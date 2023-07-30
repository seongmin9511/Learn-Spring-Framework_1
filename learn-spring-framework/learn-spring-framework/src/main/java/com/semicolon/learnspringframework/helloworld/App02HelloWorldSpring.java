package com.semicolon.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try( var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class) )
		{
			System.out.println( context.getBean("name") );
			System.out.println( context.getBean("age") );
			System.out.println( context.getBean("person") );
			System.out.println( context.getBean("person2MethodCall") );
			System.out.println( context.getBean("person3Parameters") );
			System.out.println( context.getBean("person4Qualifier") );
			
			System.out.println("개수 : "  + context.getBeanDefinitionCount());
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println( context.getBean(Address.class) );
		}
	}
}