package com.bookletnotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BookletNotesApplication extends SpringApplicationBuilder{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BookletNotesApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(BookletNotesApplication.class, args);
	}
}
