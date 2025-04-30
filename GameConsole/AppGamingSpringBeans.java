// Using Spring framework to manage objects (i.e. creation and deletion of objects for our games.)
package GameConsole;

import GameConsole.game.GameRunner;
import GameConsole.game.GamingConsole;
import GameConsole.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("GameConsole.game") //Telling Spring to Scan the component(Whose object will be created by spring) in the provided package name.
public class AppGamingSpringBeans {

    @Bean
    public GameRunner gameRunner(GamingConsole game){ //Wiring our pacman game whose object was automatically created by spring through the use of @Component annotation
        System.out.println("Parameter: "+game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(AppGamingSpringBeans.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}