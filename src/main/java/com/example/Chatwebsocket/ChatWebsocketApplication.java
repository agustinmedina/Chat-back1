package com.example.Chatwebsocket;

import com.example.Chatwebsocket.models.dao.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ChatWebsocketApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(ChatWebsocketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
