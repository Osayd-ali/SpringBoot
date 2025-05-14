package GameConsole.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) { //Injecting the qualifier object into the constructor of the GameRunner class.
        this.game = game;
    }
    public void run(){
        System.out.println("Running game " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

