// Create a class Greeter with a method sayHello(String name) and call it via method reference.

class Greeter {
    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

interface Greeting {
    void greet(String name);
}

public class Class_Method {
    public static void main(String[] args) {
        Greeter g = new Greeter();

        Greeting ref = g::sayHello;

        ref.greet("Shreyans Sharma");
    }
}