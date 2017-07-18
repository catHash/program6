/**
 * Created by anonymous on 7/17/17.
 */
public class Square extends Shape {
    private double side;

    public Square(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        return (side*side);
    }

    @Override
    public double getVolume() {
        return (side*side*side);
    }

    public void setSide(double side) {
        this.side = side;
    }
}
