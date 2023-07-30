package com.semicolon.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 10, new Address("bookgu", "Degu"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		var person = new Person(name, age, address2);
		return person;
	}
	
	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("address2Qualifier") Address address2) {
		var person = new Person(name, age, address2);
		return person;
	}
	
	@Bean(name="yourCustomBean")
	@Primary
	public Address address() {
		var address = new Address("joonggu", "Degu");
		return address;
	}
	
	@Bean
	@Qualifier("address2Qualifier")
	public Address address2() {
		var address = new Address("soosunggu", "Degu");
		return address;
	}
}
