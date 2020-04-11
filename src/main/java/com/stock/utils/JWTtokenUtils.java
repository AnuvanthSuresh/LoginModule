package com.stock.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class JWTtokenUtils {


    Random random = new Random();

	public String GenerateToken(String username) {
		
		String Token;
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy--HH:mm:ss--");  
		   LocalDateTime now = LocalDateTime.now();
		   int x = random.nextInt(900) + 100;
		   Token = dtf.format(now)+username+"/-"+x+"-/";
		   return Token;
	
	}
}
