package br.com.fdrtec.votingsessionapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotingSessionApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VotingSessionApiApplication.class, args);
        System.out.println("hello world!!!");
    }

}
