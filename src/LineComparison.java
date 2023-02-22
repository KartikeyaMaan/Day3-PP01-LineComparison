public class LineComparison {

    int x1;
    int y1;
    int x2;
    int y2;
    int length;

    //function to create a line and return its length
    public LineComparison() {
        this.x1 = generateCoordinate();
        this.y1 = generateCoordinate();
        this.x2 = generateCoordinate();
        this.y2 = generateCoordinate();
        this.length=(int) Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }

    //returns a random number between 0 and 10
    private int generateCoordinate() {
        return (int) (Math.random() * 10);
    }

    //checks for equality
    public boolean equals(LineComparison line) {
        return this.length==line.length;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        LineComparison line1 = new LineComparison();
        System.out.println("Points of line1 : ("+line1.x1+", "+line1.y1 + ")   ("+ line1.x2+", "+line1.y2+")");
        System.out.println("Length of line1 = " + line1.length);

        //adding second line
        LineComparison line2=new LineComparison();
        System.out.println("Points of line1 : ("+line2.x2+", "+line2.y2 + ")   ("+ line2.x2+", "+line2.y2+")");
        System.out.println("Length of line1 = " + line2.length);

        //checking for equality
        if(line1.equals(line2))
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal");
    }
}
