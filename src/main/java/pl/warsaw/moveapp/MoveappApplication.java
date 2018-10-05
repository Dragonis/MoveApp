package pl.warsaw.moveapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MoveappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoveappApplication.class, args);
    }
}
