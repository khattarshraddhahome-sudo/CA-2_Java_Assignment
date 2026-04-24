// 1.Write a Java program to create a class Student with data members name and age. Create an object and display the values.

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shreyans Sharma";
        s.age = 20;
        s.display();
    }
}