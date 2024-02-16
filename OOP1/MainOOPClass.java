package OOP1;

public class MainOOPClass {
    static double distanse(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y,2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);
        // a.setX(12);
        // Point2D a = new Point2D();
        // a.x = 0;
        // a.y = 2;
        // System.out.println(a.toString());
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0);
        // b.setX(12);
        // Point2D b = new Point2D(0,10);
        // Point2D b = new Point2D();
        // b.x = 0;
        // b.y = 10;
        // System.out.println(b);
        // System.out.println(a.getInfo()); сделали его с public в privot // поэтому выдает ошибку
        // System.out.println(b.toString());
        // System.out.println(distanse(a,b);
        var d = Point2D.distanse(a,b);
        System.out.println(d);
    }
}