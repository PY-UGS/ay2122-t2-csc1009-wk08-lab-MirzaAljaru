//Question 1
public class CircleWithException {
    private double radius;

    public void setRadius(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("Radius is not a positive number.");
        }else{
            this.radius = radius;
        }
    }
    
    public double getRadius(){
        return this.radius;
    }

    public double getArea() throws Exception{
        double area;
        area = Math.PI * radius * radius;
        if(area > 1000){
            throw new Exception("Area bigger than 1000!");
        }
        else{
            return area;
        }
    }

    public double getDiameter(){
        double diameter;
        diameter = 2 * radius;
        return diameter;
    }



    
}
