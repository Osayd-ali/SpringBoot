package GameConsole.game;

public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Go up");
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
