package warmup.functions;

public class FuncClass {
    public static void main(String[] args) {
        FuncClass obj = new FuncClass();
        obj.greet();
    }

    // studied about static and non-static methods
    // static = class level, non-static = object level
    void greet(){
        System.out.println("Hello!");
    }
}

