package com.semicolon.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semicolon.learnspringframework.game.GameRunner;
import com.semicolon.learnspringframework.game.GamingConsole;
import com.semicolon.learnspringframework.game.PackMan;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PackMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner( game );
		return gameRunner;
	}
}
