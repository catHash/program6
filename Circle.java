import java.math.*;
public class Circle extends Shape
{
    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }


    private double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        double circleArea = (Math.PI * getRadius() * getRadius());
        return circleArea;
    }
    public double getVolume()
    {
        double circleVolume = (4/3 * Math.PI * getRadius() * getRadius() * radius);
        return circleVolume;
    }
}