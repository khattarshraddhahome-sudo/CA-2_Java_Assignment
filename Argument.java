// Write a lambda expression that takes no arguments and returns the string "Hello Lambda!".

interface Message {
    String say();
}

public class Argument {
    public static void main(String[] args) {
        Message m = () -> "Hello Lambda!";

        System.out.println(m.say());
    }
}