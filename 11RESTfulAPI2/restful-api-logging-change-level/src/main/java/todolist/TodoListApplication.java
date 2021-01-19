package todolist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TodoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			log.trace("I'm TRACE log");
			log.debug("I'm DEBUG log");
			log.info("I'm INFO log");
			log.warn("I'm WARN log");
			log.error("I'm ERROR log");
			Thread.sleep(3000);
		}
	}

}
