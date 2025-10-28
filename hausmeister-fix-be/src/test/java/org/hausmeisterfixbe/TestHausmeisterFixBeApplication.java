package org.hausmeisterfixbe;

import org.springframework.boot.SpringApplication;

public class TestHausmeisterFixBeApplication {

    public static void main(String[] args) {
        SpringApplication.from(HausmeisterFixBeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
