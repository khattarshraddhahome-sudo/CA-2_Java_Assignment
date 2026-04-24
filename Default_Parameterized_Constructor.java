// 3. Write a program to demonstrate the use of default constructor and parameterized constructor. 

class Default_Parameterized_Constructor {
    int x;

    Default_Parameterized_Constructor() {
        x = 10;
    }

    Default_Parameterized_Constructor(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        Default_Parameterized_Constructor d1 = new Default_Parameterized_Constructor();
        Default_Parameterized_Constructor d2 = new Default_Parameterized_Constructor(50);

        d1.display();
        d2.display();
    }
}