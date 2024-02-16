package OOP1;
/**
 * Это точка 2D
 */
public class Point2D {
    int x; // поля класса по умолчанию public меняем на privat
    int y;
    /**
     * Это Конструктор
     * @param valueX Это Координата X
     * @param valueY Это Координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
        // пользовательский конструктор описанный нами
    }

    public Point2D(int value) {
        this(value, value);
        //  используется таким образом конструктор который выше
    }

    public Point2D() {
        this(0);
        // использует констуктор выше, таким образом образуется каскад вызовов
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }


    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // }

    private String getInfo() {
        return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
        // переопределение метода
        // return getInfo(); // не будет работать в клиенском коде так как он private поэтому код ниже -
        return String.format("x: %d, y: %d", x, y);
    }

    public static Object distanse(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y,2));
        
    }

}
