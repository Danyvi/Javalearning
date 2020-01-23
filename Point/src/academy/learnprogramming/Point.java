package academy.learnprogramming;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return (Math.sqrt( (Math.pow(x, 2)) + (Math.pow(y, 2)) ));
    }

    public double distance(int x, int y) {
        return (Math.sqrt( (Math.pow((this.x-x), 2)) + (Math.pow((this.y - y), 2)) ));
    }

    public double distance(Point other) {
        int xB = other.x;
        int yB = other.y;

        return (Math.sqrt( (Math.pow((xB - this.x), 2)) + (Math.pow((yB - this.y), 2)) ));
    }
}
