/**
 * Created by anonymous on 7/17/17.
 */
public class Triangle extends Shape {
    private double length,base,height;

    public Triangle(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        return ((base*height)/2);
    }

    @Override
    public double getVolume() {
        return ((length*base*height)/3);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
