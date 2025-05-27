// Exploring Java Spring Framework Bean Scopes
package examples3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class NormalClass {
    public NormalClass() { //Everytime this bean is requested, the same instance is returned.
        System.out.println("NormalClass Constructor");
    }
}
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass { //Everytime this bean is requested, a new instance of the bean is created.
    public PrototypeClass() { // By default, the scope of a bean is singleton.
        System.out.println("PrototypeClass Constructor");
    }
}
@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            // Printing the beans and checking the scope of the beans.
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}