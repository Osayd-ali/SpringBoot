// Exploring Spring beans, PostConstruct and PreDestroy annotations
package example4;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;
    public SomeClass (SomeDependency someDependency) {
        System.out.println("Constructor Injection");
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }
    //As soon as the dependency is injected, this method will be called.
    // How can i get the below method to run, as soon as the dependencies are wired in?
    // @PostConstruct, we can use this annotation to run the method after the dependencies are injected.
    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }
}

@Component
class SomeDependency{
    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}