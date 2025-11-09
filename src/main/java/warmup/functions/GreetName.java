package warmup.functions;

public class GreetName {

    public static void main(String[] args) {
        greet("Aayam");
        greet("Aaryan");
        String txt = "John Doe";
        greet(txt);
    }

    static void greet(String name){
        System.out.println("Hello, " + name);
    }
}
