package org.example.noteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.naming.Context;

@EnableFeignClients
@SpringBootApplication
public class NoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteServiceApplication.class, args);
    }

}
