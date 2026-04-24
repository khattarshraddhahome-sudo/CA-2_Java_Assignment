// 4. Create a class Rectangle with length and breadth. Calculate area using a method.

class Rectangle {
    int length, breadth;

    void setData(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setData(5, 4);
        System.out.println("Area: " + r.calculateArea());
    }
}