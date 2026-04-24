// 5. Write a program where a class contains a method to input values using Scanner and another method to display them.

import java.util.Scanner;

class InputDemo {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }

    void display() {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        InputDemo obj = new InputDemo();
        obj.input();
        obj.display();
    }
}