package beanpractice;

import java.io.Serializable;

//Any Java object that is managed by Spring is a Spring Bean
//Spring uses IOC Container (Bean Factory or ApplicationContext) to manage these objects
class Pojo { // Pojo stands for plain old java object.
    private String text;
    private int number;
    public String toString() {
        return text + ":" + number;
    }
}

// Let us see how to create a java bean, Instances of this class will become a java bean
class JavaBean implements Serializable { // It should implement serializable // also called as EJB, Enterprise Java Beans
    //1. It should have a public no-arg constructor
    public JavaBean(){

    }
    private String text;
    private int number;
    //2. It should have getters and setters
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
}

public class javapojospring {
    public static void main(String[] args){
        Pojo pojo = new Pojo();
        JavaBean javaBean = new JavaBean();
        System.out.println(pojo);
        System.out.println(javaBean.getText() + javaBean.getNumber());
    }
}