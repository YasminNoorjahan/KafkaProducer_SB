package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
@EnableKafka
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }


	/*@Component
	public static class MyCommandLineRunner implements CommandLineRunner {
		@Autowired
		EmployeeProducer employeeProducer;

		@Override
		public void run(String... args) throws Exception {
			// Access command-line arguments here
			System.out.println("Command line arguments:");
			Long i = 1L;
			while (1 == 1) {
				employeeProducer.sendEmployee(new Employee(i++, new Scanner(System.in).next()));
			}
		}
	}*/
}
