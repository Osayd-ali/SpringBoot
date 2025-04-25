package GameConsole;

import GameConsole.game.GameRunner;
import GameConsole.game.MarioGame;
import GameConsole.game.PacmanGame;
import GameConsole.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args){
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame(); //Object creation // pacmanGame is a dependency and we are wiring it to gameRunner class.
        var gameRunner = new GameRunner(pacmanGame); //pacmanGame class is wired (or injected) into the GameRunner class.
        // Object creation + wiring of dependencies
        // pacmanGame is a dependency of GameRunner
        gameRunner.run();
    }
}
