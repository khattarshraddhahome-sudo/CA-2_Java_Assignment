// Given the following functional interface:
// interface CheckNumber {
// boolean isGreaterThanTen(int n);
// }
// Write a lambda expression that implements CheckNumber and returns true if the input integer is greater than 10, and false otherwise.


interface CheckNumber {
    boolean isGreaterThanTen(int n);
}

public class Greater {
    public static void main(String[] args) {
        CheckNumber c = (n) -> n > 10;

        System.out.println(c.isGreaterThanTen(15));
    }
}