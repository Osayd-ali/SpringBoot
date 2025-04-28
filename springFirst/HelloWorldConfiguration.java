package springFirst;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//Configure the things that we want spring to manage.

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}
@Configuration // @Configuration is an annotation that says
public class HelloWorldConfiguration { //this HelloWorldConfiguration class contains the beans that we would want to manage using spring.
    @Bean //Creating a bean or a member which will be managed by spring context.
    public String name(){
        return "Hello Spring";
    }
    @Bean
    public int age(){
        return 23;
    }
    @Bean
    public Person person(){
        return new Person("Osayd", 24, new Address("Howard st", "Chicago"));
    }
    @Bean
    public Person person2Methodcall(){ //Wiring the above beans to this bean through a method call
        return new Person(name(), age(), Address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address2){ //Wiring the above beans to this bean through passing them as parameters.
        return new Person(name, age, address2);
    }
    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("address2Qualifier") Address address) { // Autowiring a matching bean
        return new Person(name, age, address);
    }
    @Bean(name = "address2")
    @Qualifier("address2Qualifier")
     public Address Address(){
        return new Address("Baker street", "Chicago");
    }
    @Bean(name = "address3")
    @Primary // This is to set this particular bean as primary, as there are two matching beans of type address (i.e. address2 and address3)
    public Address Address3(){
        return new Address("Newgard Street", "Chicago");
    }

}

