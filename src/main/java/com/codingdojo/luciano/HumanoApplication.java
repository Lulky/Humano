package com.codingdojo.luciano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class HumanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanoApplication.class, args);
	}
	
	/*@RequestMapping("/")
	public String despliegaHome() {
		return "Hola desde Spring";
	}*/
}
