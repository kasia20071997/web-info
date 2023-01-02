package com.kantanyuk.webinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class WebInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebInfoApplication.class, args);
	}

}

