import java.util.Scanner;

public class CalcalateShapeArea 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("What's your want to calculate?");
        System.out.println("1: Area of Rectangle");
        System.out.println("2: Area of Circle");
        System.out.println("3: Area of Triangle");
        int choice = sc.nextInt();

        if (choice == 1) { // Calculate the Rectangle

            System.out.println("Enter the length of the rectangle : ");
            int length = sc.nextInt();
            System.out.println("Enter the width of the rectangle : ");
            int width = sc.nextInt();
            int calRectangle = length * width;
            System.out.println("The area of the rectangle is: " + calRectangle);

        } else if (choice == 2) { // Calculate the Circle

            System.out.print("Enter the radius of the circle : ");  
            int radius = sc.nextInt();;
            double pi = 3.1415926;
            double calCircle = radius * radius + pi; 
            System.out.println("The area of the circle is: " + calCircle);

        } else if (choice == 3) { // Calculate the Triangle

            System.out.println("Enter the base of the triangle : ");
            int base = sc.nextInt();
            System.out.println("Enter the height of the triangle : ");          
            int height = sc.nextInt();
            int calTriangle = (base * height) / 2;
            System.out.println("The area of the triangle is: " + calTriangle);            

        } else {
            System.out.println("Invalid choice.");
        }
    }
}
