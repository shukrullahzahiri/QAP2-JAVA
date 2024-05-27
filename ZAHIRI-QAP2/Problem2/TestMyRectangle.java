public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 0, 3, 4);
        System.out.println(rectangle1); // Expected: MyRectangle[topLeft=(0, 0), bottomRight=(3, 4)]
        System.out.println("Width: " + rectangle1.getWidth()); // Expected: 3
        System.out.println("Height: " + rectangle1.getHeight()); // Expected: 4
        System.out.println("Area: " + rectangle1.getArea()); // Expected: 12
        System.out.println("Perimeter: " + rectangle1.getPerimeter()); // Expected: 14

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyRectangle rectangle2 = new MyRectangle(p1, p2);
        System.out.println(rectangle2); // Expected: MyRectangle[topLeft=(1, 2), bottomRight=(4, 6)]
        System.out.println("Width: " + rectangle2.getWidth()); // Expected: 3
        System.out.println("Height: " + rectangle2.getHeight()); // Expected: 4
        System.out.println("Area: " + rectangle2.getArea()); // Expected: 12
        System.out.println("Perimeter: " + rectangle2.getPerimeter()); // Expected: 14

        rectangle2.setTopLeft(new MyPoint(2, 3));
        rectangle2.setBottomRight(new MyPoint(5, 7));
        System.out.println(rectangle2); // Expected: MyRectangle[topLeft=(2, 3), bottomRight=(5, 7)]
        System.out.println("Width: " + rectangle2.getWidth()); // Expected: 3
        System.out.println("Height: " + rectangle2.getHeight()); // Expected: 4
        System.out.println("Area: " + rectangle2.getArea()); // Expected: 12
        System.out.println("Perimeter: " + rectangle2.getPerimeter()); // Expected: 14
    }
}
