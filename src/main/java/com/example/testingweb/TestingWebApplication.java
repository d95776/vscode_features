package com.example.testingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.mapstruct.factory.Mappers;


@SpringBootApplication
public class TestingWebApplication {

	public static void main(String[] args) {
		SimpleSourceDestinationMapper mapper
		= Mappers.getMapper(SimpleSourceDestinationMapper.class);

		SpringApplication.run(TestingWebApplication.class, args);
	}
}
