public class Cylinder extends Circle {
    // write your code here
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.height * this.getArea();
    }
}