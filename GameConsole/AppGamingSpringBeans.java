// Using Spring framework to manage objects (i.e. creation and deletion of objects for our games.)
package GameConsole;

import GameConsole.game.GameRunner;
import GameConsole.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}