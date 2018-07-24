package com.gov.notice.gov_notice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Server 
{
  
    	 public static void main( String[] args ) throws Exception
 	    {   System.setProperty("spring.devtools.restart.enabled", "true");

 	    	SpringApplication.run(Server.class, args);
 	        
 	    }
   
}
