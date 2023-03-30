package com.hmit.tram.control;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.hmit.tram")
@ComponentScan("com.hmit.tram")
public class TramApiApplication {
	Logger logger_ = LoggerFactory.getLogger( TramApiApplication.class );

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(TramApiApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run(args);
	}
}
