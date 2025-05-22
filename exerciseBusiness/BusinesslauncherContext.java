package exerciseBusiness;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration
public class BusinesslauncherContext {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(BusinesslauncherContext.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}