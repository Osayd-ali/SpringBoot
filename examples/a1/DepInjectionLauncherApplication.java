package examples.a1;
// Example of field injection. No setter or constructor. Dependency is injected using reflection.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{
    @Autowired
    Dependency1 dependency1; // Here we are using field injection. Spring will inject the object of this class into the YourBusinessClass class using reflection.

    @Autowired
    Dependency2 dependency2; // Here we are using field injection. Spring will inject the object of this class into the YourBusinessClass class using reflection.

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}
@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}