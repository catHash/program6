import java.util.Scanner;
public class ShapeMain
{

    public static void main(String[] args)
    {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        while (choice =! 5)
        {
            switch(choice)
            {
                case 1:
                    Circle circle = new Circle(name, radius)
                    System.out.println("Enter value of the Circle's radius");
                    circle.setRadius(input.nextDouble());

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