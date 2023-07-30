package com.semicolon.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.semicolon.learnspringframework.game.GameRunner;
import com.semicolon.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try( var context = new AnnotationConfigApplicationContext(GamingConfiguration.class) ){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			System.out.println("COUNT : " + context.getBeanDefinitionCount());
			System.out.println("BEANS : ");
			
			Arrays.stream( context.getBeanDefinitionNames() ).forEach(System.out::println);
		}
	}
}