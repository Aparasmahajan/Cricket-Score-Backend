package com.cricket.aps;

import com.cricket.aps.entity.Match;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketInformerBackendApplication {

	public static void main(String[] args) {
		Match match=new Match();
		SpringApplication.run(CricketInformerBackendApplication.class, args);
	}

}
