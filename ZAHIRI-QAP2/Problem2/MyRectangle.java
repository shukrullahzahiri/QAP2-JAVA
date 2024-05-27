public class MyRectangle {
    private MyPoint topLeft, bottomRight;

    // Constructor to initialize the rectangle with x, y coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor to initialize the rectangle with MyPoint instances
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter for the top-left point
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Setter for the top-left point
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter for the bottom-right point
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setter for the bottom-right point
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method to calculate the width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate the height of the rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Method to represent the rectangle as a string
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
