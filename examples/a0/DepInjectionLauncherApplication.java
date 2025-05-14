package examples.a0;

import GameConsole.game.GameRunner;
import GameConsole.game.GamingConsole;
import GameConsole.game.PacmanGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
    }
}