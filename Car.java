// 2. Create a class Car with attributes model, year, price. Initialize them using a constructor. Display data using a method.

class Car {
    String model;
    int year;
    double price;

    Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car c = new Car("BMW", 2023, 5000000);
        c.display();
    }
}