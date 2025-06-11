package GameConsole.game;

import org.springframework.stereotype.Component;

@Component //Telling Spring to create an instance of this specific class.
public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Go up |");
    }
    public void down(){
        System.out.println("Go down");
    }
    public void right(){
        System.out.println("Go right and eat");
    }
    public void left(){
        System.out.println("Go left and eat");
    }
}
