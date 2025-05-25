// Exploring Spring beans, PostConstruct and PreDestroy annotations
package example4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}