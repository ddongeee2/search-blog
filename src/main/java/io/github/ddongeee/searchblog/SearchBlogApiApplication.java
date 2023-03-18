package io.github.ddongeee.searchblog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class SearchBlogApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SearchBlogApiApplication.class, args);
	}

//	todo : deprecated
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		log.info("@@@ hello world, I have just started up");
	}
}
