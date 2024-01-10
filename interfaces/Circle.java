package gr.aueb.cf.TEST.interfaces;

public class Circle extends AbstractShape implements ITwoDimensional, ICircle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius;
    }

    @Override
    public long getCircumference() {
        return (long)(2 * 3.14 * radius);
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }
}
