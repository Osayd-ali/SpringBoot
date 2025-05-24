// Demonstration of Lazy Initialization of spring beans
package examples2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@ComponentScan
@Configuration
public class LazyInitializationLauncherApplication {
    public static void main(String[] args){
        try ( var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}