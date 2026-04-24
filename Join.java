// Use a lambda to join two strings.

interface StringJoin {
    String join(String a, String b);
}

public class Join {
    public static void main(String[] args) {
        StringJoin s = (a, b) -> a + b;

        System.out.println(s.join("Hello ", "World"));
    }
}