package SpringBoot_;

class Pojo {
    private String text;
    private int number;
    public String toString() {
        return text + ":" + number;
    }
}

public class javapojospring {
    public static void main(String[] args){
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }
}