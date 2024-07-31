package com.camunda.academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* NON-MAVEN TEMPLATE:
   1. Add the project's dependencies as JARs to the classpath manually.
      Your training instructor will provide you with the relevant files.
   2. Configure your IDE to pass "-parameters" as an additional command line argument to the Java compiler. */

@SpringBootApplication
public class PaymentApplication {

	public static void main(final String... args) {
		SpringApplication.run(PaymentApplication.class, args);
	}
}
