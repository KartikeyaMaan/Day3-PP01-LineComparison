public class Line {

    Point point1;
    Point point2;
    double length;

    public Line() {
        point1 = new Point();
        point2 = new Point();
        length = Math.sqrt(Math.pow(point2.x - point1.x, 2.0) + (Math.pow((point2.y - point1.y), 2.0)));
    }

    public boolean equals(Line line) {
        return this.length == line.length;
    }

    public int compareTo(Line line) {
        return (int) (this.length - line.length);
    }

    public static void main(String[] args) {
        Line line1 = new Line();
        Line line2 = new Line();
        if (line1.equals(line2))
            System.out.println("lines are equal");
        else
            System.out.println("lines not equal");

        if (line1.compareTo(line2) == 0)
            System.out.println("lines are equal");
        else if (line1.compareTo(line2) < 0)
            System.out.println("line1 is less than line2");
        else
            System.out.println("line1 is greater than line2");
    }
}
