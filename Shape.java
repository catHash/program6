//Jessica Hadwiger Program 6
import java.util.*;
public abstract class Shape
{
    protected  String shapeName;
    public Shape (String name)
    {
        shapeName = name;
    }
    public abstract double getArea();
    public abstract double getVolume();
}