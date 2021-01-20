package com.micro.Zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
public class ZooApplication extends SpringBootServletInitializer  {
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(ZooApplication.class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(ZooApplication.class, args);
	}

}
