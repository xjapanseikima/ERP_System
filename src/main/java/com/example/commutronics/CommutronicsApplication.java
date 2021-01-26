package com.example.commutronics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class CommutronicsApplication {
		public static void main(String[] args) {
			SpringApplication.run(CommutronicsApplication.class, args);
		}
}
