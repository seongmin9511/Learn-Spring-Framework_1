package com.semicolon.learnspringframework;

import com.semicolon.learnspringframework.game.GameRunner;
import com.semicolon.learnspringframework.game.MarioGame;
import com.semicolon.learnspringframework.game.PackMan;
import com.semicolon.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PackMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
