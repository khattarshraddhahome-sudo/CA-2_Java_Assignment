// 10. Demonstrate how reference variables store objects and how multiple references can point to the same object.

class RefDemo {
    int x = 10;

    public static void main(String[] args) {
        RefDemo obj1 = new RefDemo();
        RefDemo obj2 = obj1;

        obj2.x = 50;

        System.out.println("obj1 x: " + obj1.x);
        System.out.println("obj2 x: " + obj2.x);
    }
}