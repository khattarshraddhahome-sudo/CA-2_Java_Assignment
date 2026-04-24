//  6. Create a class Employee with attributes id, name, salary. Use constructor overloading for:
// •	default constructor
// •	constructor with 2 parameters
// •	constructor with 3 parameters


class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "Default";
        salary = 0;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "Rahul");
        Employee e3 = new Employee(2, "Amit", 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}