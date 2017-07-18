import java.util.Scanner;
public class ShapeMain
{

    public static void main(String[] args)
    {
        int choice = 0;
        Scanner input = new Scanner(System.in);

        //Be sure to verify the user enters positive numbers and limit the display to 2 decimals.

        while (choice != 5)
        {
            displayMenu();
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    Circle circle = new Circle("circle", 3.14);
                    System.out.println("Enter value of the Circle's radius");
                    circle.setRadius(input.nextDouble());
                    break;

                case 2:
                    //Square
                    break;

                case 3:
                    Rectangle tangle = new Rectangle("Brian's Rectangle");
                    System.out.println("Enter Length");
                    tangle.setLength(input.nextDouble());
                    System.out.println("Enter Width");
                    tangle.setWidth(input.nextDouble());
                    System.out.println("Enter Height");
                    tangle.setHeight(input.nextDouble());
                    System.out.print("Rectangle Area: ");
                    System.out.println(tangle.getArea());
                    System.out.print("Rectangle Volume: ");
                    System.out.println(tangle.getVolume());
                    break;

                case 4:
                    //triangle
                    break;

                case 5:
                    return;

            }
        }//end of the while
    }//end of main
    private static void displayMenu()
    {
        System.out.println("***Shape Calculator***");
        System.out.println("Enter 1 for a Circle");
        System.out.println("Enter 2 for a Square");
        System.out.println("Enter 3 for a Rectangle");
        System.out.println("Enter 4 for a Triangle");
        System.out.println("Enter 5 to Exit.");
    }// end of the displayMenu
}//end of class