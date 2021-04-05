package com.ftiuksw.serviceskamus;

import com.ftiuksw.serviceskamus.models.TranslateResult;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceskamusApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(ServiceskamusApplication.class, args);
	}
        
       

}
