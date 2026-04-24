// 9. Create a class Box with height, width, depth. Create multiple objects and calculate volume of each.

class Box {
    int height, width, depth;

    Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    int volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4);
        Box b2 = new Box(5, 6, 7);

        System.out.println("Volume 1: " + b1.volume());
        System.out.println("Volume 2: " + b2.volume());
    }
}