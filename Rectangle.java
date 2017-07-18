/**
 * Created by anonymous on 7/17/17.
 */
public class Rectangle extends Shape {
    private double length,width,height;

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        return (length*width);
    }

    @Override
    public double getVolume() {
        return (length*width*height);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
