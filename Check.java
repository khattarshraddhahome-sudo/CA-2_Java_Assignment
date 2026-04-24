// Use a lambda to Check if a Number is Divisible by 3

interface Divisible {
    boolean check(int n);
}

public class Check {
    public static void main(String[] args) {
        Divisible d = (n) -> n % 3 == 0;

        System.out.println(d.check(9));
    }
}