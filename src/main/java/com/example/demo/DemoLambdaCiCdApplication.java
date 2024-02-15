package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.p1.MyLambda;

@SpringBootApplication
public class DemoLambdaCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLambdaCiCdApplication.class, args);
	}

    @Bean
	MyLambda lambdaHandler() {
        return new MyLambda();
    }
}
