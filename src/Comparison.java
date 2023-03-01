public class Comparison {

    public static boolean equals(Line line1, Line line2) {
        return line1.length == line2.length;
    }

    public static int compareTo(Line line1, Line line2) {
        return (int) (line1.length - line2.length);
    }

    public static void main(String[] args) {
        Line line1 = new Line();
        Line line2 = new Line();

        if (equals(line1, line2))
            System.out.println("lines are equal");
        else
            System.out.println("lines not equal");

        if (compareTo(line1, line2) == 0)
            System.out.println("lines are equal");
        else if (compareTo(line1, line2) < 0)
            System.out.println("line1 is less than line2");
        else
            System.out.println("line1 is greater than line2");
    }
}
