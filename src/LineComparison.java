public class LineComparison {

    int x1;
    int y1;
    int x2;
    int y2;

    //returns a random number between 0 and 10
    private int generateCoordinate() {
        return (int) (Math.random() * 10);
    }

    //returns length of line
    public int getLength() {
        return (int) Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }

    //function to create a line and return its length
    public LineComparison() {
        this.x1 = generateCoordinate();
        this.y1 = generateCoordinate();
        this.x2 = generateCoordinate();
        this.y2 = generateCoordinate();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        LineComparison line1 = new LineComparison();
        System.out.println("Points of line : ("+line1.x1+", "+line1.y1 + ")   ("+ line1.x2+", "+line1.y2+")");
        System.out.println("Length of line = " + line1.getLength());
    }
}
