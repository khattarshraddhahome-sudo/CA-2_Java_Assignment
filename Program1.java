// Program 1
// Create an interface Calculator that contains:
// •	a static method square(int n)
// •	a static method cube(int n)
// Write a class to call these methods and print results.


interface Calculator {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }
}

public class Program1 {
    public static void main(String[] args) {

        int num = 5;

        System.out.println("Square: " + Calculator.square(num));
        System.out.println("Cube: " + Calculator.cube(num));
    }
}