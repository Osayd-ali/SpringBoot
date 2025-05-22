package exerciseBusiness;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@ComponentScan
@Configuration
public class BusinesslauncherContext {
    public static void main(String[] args){
        try (var context = new AnnotationConfigApplicationContext(BusinesslauncherContext.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}