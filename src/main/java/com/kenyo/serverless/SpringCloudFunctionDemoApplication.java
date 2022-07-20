package com.kenyo.serverless;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionDemoApplication.class, args);
	}
	
	@Bean
	public Function<String, String> toUpperCase() {
		return (input) -> input.toUpperCase();
	}
	
	@Bean
	public Consumer<String> sayHelloConsumer() {
		return (input) -> System.out.println("Hello " + input);
	}
	
	@Bean
	public Supplier<String> sayHelloSupplier() {
		return () -> "Hello cloud function";
	}

}
