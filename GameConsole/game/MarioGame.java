package GameConsole.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //Telling spring to create this object as the primary object when there are multiple objects of the same type.
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump:");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void down(){
        System.out.println("Go into hole");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
