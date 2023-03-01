public class Line {

    Point point1;
    Point point2;
    double length;

    public Line() {
        point1 = new Point();
        point2 = new Point();
        length = Math.sqrt(Math.pow(point2.x - point1.x, 2.0) + (Math.pow((point2.y - point1.y), 2.0)));
    }
}
