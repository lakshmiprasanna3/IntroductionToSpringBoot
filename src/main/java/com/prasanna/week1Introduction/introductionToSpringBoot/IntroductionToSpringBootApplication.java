package com.prasanna.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired //this object should be injected
	Apple obj;
	@Autowired
	DBService dbService;

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();

		System.out.println(dbService.getData());

		cakeBaker.bakeCake();
	}
}
