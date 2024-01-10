package gr.aueb.cf.TEST.interfaces;

public class Line extends AbstractShape implements ILine{
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }
}
