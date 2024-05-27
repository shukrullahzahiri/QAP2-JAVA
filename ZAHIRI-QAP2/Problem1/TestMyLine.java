public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1); // Expected: MyLine[begin=(0, 0), end=(3, 4)]
        System.out.println("Length: " + line1.getLength()); // Expected: 5.0
        System.out.println("Gradient: " + line1.getGradient()); // Expected: 0.93 (approximately)

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2); // Expected: MyLine[begin=(1, 2), end=(4, 6)]
        System.out.println("Length: " + line2.getLength()); // Expected: 5.0
        System.out.println("Gradient: " + line2.getGradient()); // Expected: 0.93 (approximately)

        line2.setBegin(new MyPoint(2, 3));
        line2.setEnd(new MyPoint(5, 7));
        System.out.println(line2); // Expected: MyLine[begin=(2, 3), end=(5, 7)]
        System.out.println("Length: " + line2.getLength()); // Expected: 5.0
        System.out.println("Gradient: " + line2.getGradient()); // Expected: 0.93 (approximately)

        line1.setBeginXY(1, 1);
        line1.setEndXY(4, 5);
        System.out.println(line1); // Expected: MyLine[begin=(1, 1), end=(4, 5)]
        System.out.println("Length: " + line1.getLength()); // Expected: 5.0
        System.out.println("Gradient: " + line1.getGradient()); // Expected: 0.93 (approximately)
    }
}
