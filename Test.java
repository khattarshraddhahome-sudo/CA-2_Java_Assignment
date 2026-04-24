// 8. Write a program to show how one constructor calls another constructor using this().

class Test {
    int a, b;

    Test() {
        this(10, 20);
    }

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}