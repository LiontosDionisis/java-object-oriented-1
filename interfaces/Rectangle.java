package gr.aueb.cf.TEST.interfaces;

public class Rectangle extends AbstractShape implements ITwoDimensional, IRectangle{
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width + height;
    }

    @Override
    public long getCircumference() {
        return 2 * (long)(height + width);
    }
}
