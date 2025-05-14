package springFirst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpring {
    public static void main(String[] args){
        //1: Launch a spring context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //For the above, we are basically saying that we would want to launch a spring context with the specific configuration that we passed as argument.
            //2: Configure the things that we want Spring to manage - @Configuration
            // the above is done in HelloWorldConfiguration file
            //3: retrieving the bean through spring context.
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2Methodcall"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean(Address.class));
            // How to list all the spring or pojo beans that we created
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("person4Parameters"));
        };
    }
}
