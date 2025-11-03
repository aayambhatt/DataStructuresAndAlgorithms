package warmup;

class Person{
    String name;
    int age;
    String gender;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ObjectInJava {
    public static void main(String[] args) {
        // object creation
        Person p1 = new Person("Aayam", 23);
        p1.gender = "Male";

        System.out.println(p1.name + p1.gender);



    }

}
