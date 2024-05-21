public class Task14b {
    public static void main(String[] args) {
        Task14a square = new Task14a();
        // Shape Length
        square.setShapeLength(9);
        int length = square.getShapeLength();
        // Shape Breadth
        square.setShapeBreadth(9);
        int breadth = square.getShapeBreadth();
        // Area = Length * Breadth
        int area = length * breadth;
        System.out.println("The area of a square of length: " +length+ " and breadth: " +breadth+ " is " + area);
    }

}
