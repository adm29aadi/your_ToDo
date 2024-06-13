package com.example.myfirstapp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstappApplication {

	public static void main(String[] args) {
	    SpringApplication.run(MyfirstappApplication.class, args);
	}
}
