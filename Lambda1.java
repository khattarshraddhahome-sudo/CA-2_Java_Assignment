// 1)	Write a lambda expression to implement the MathOperation functional interface that returns the square of a given integer.

interface MathOperation {
    int operate(int a);
}

public class Lambda1 {
    public static void main(String[] args) {
        MathOperation square = (a) -> a * a;

        System.out.println(square.operate(5));
    }
}