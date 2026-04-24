//  Write a lambda expression that implements IsPositive and returns true if he integer is positive (greater than zero), and false otherwise.

interface IsPositive {
    boolean check(int n);
}

public class Positive {
    public static void main(String[] args) {
        IsPositive p = (n) -> n > 0;

        System.out.println(p.check(5));
    }
}