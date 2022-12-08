package no.sbsivertsen.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LearningspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningspringApplication.class, args);
	}

}
