// Write a lambda expression to find the maximum of two numbers.

interface MaxOperation {
    int max(int a, int b);
}

public class Lambda2 {
    public static void main(String[] args) {
        MaxOperation m = (a, b) -> (a > b) ? a : b;

        System.out.println(m.max(10, 20));
    }
}