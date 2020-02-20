package com.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenShiftMicroServiceDemoApplication {

	public static void main(String[] args) {
		System.out.println("Program entry point");
		SpringApplication.run(OpenShiftMicroServiceDemoApplication.class, args);
	}

}
