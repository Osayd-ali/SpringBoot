package GameConsole.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) { //Injecting the qualifier object into the constructor of the GameRunner class.
        this.game = game;
    }
    //No, the class injected into the constructor (e.g., GamingConsole) is not dependent on the constructor's class (GameRunner) to run itself. GamingConsole is an independent interface, and its implementations (like PacmanGame) define their own behavior. GameRunner depends on GamingConsole to perform its tasks, but GamingConsole does not rely on GameRunner. This is a unidirectional dependency
    public void run(){
        System.out.println("Running game " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

