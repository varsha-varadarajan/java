public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.y, 2) + Math.pow(this.x, 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.y - y), 2) + Math.pow((this.x - x), 2));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((this.y - p.y), 2) + Math.pow((this.x - p.x), 2));
    }
}