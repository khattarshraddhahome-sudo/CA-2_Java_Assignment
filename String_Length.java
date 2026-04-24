// Create a functional interface that takes a String and returns its length. Then, use the method reference String::length to implement this interface.

interface StringLength {
    int getLength(String str);
}

public class String_Length {
    public static void main(String[] args) {

        StringLength len = String::length;

        System.out.println(len.getLength("Lambda"));
    }
}