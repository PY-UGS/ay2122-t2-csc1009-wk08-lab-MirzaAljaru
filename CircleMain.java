import java.util.Scanner;

//Question 1
public class CircleMain {

    public static void main(String[]args){

        CircleWithException circle = new CircleWithException();
        Scanner input = new Scanner(System.in);

        try(input){
          System.out.print("Enter Radius: ");
          double radius = input.nextDouble();
          
          circle.setRadius(radius);

          double area = circle.getArea();
          double diameter = circle.getDiameter();

          System.out.printf("Radius of the circle is %.2f\n",radius);
          System.out.printf("Area of the circle is %.2f\n",area);
          System.out.printf("Diameter of the circle is %.2f\n",diameter);

        }catch(IllegalArgumentException e){
            System.out.println("Illegal argument: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General exception " + e.getMessage());
        }

    }
}
