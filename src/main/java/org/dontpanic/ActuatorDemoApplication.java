package org.dontpanic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorDemoApplication {

	public static void main(String[] args) {
		System.setProperty("org.apache.catalina.connector.RECYCLE_FACADES", "true");
		SpringApplication.run(ActuatorDemoApplication.class, args);
	}
}
