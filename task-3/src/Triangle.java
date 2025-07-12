import java.security.Permissions;

public class Triangle {

    int sideA;
    int sideB;
    int sideC;
    
    
    public Triangle(int sideA, int sideB, int sideC) {

        if(validTriangle(sideA, sideB, sideC)) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        System.out.println("Triangle valid: side A: " + sideA + " side B: "
         + sideB + " side C: " + sideC);

       } 
        else {

        throw new IllegalArgumentException("This is not a valid triangle!");
       }
    }

    private boolean validTriangle(int sideA, int sideB, int sideC) {
        
        if((sideA + sideB) > sideC && (sideA + sideC) > sideB &&
         ( sideB + sideC) > sideA) {

        return true;

       }
        else {

        return false;

       }
    }

     public double getPerimeter() {

        double perimeterS = ((sideA + sideB + sideC)/2);

        return perimeterS;
    }

    public double getArea() {

        double area = Math.sqrt(getPerimeter() * (getPerimeter() - sideA) * 
        (getPerimeter() - sideB) * (getPerimeter() - sideC));

        System.out.println("Area of the triangle: " + area);

        return area;

    }

    String getTriangleType() {

        if(sideA == sideC && sideA == sideB) {
            System.out.println("Triangle type is: Equilateral");

        return "Equilateral Triangle";
            
        }
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
        
        System.out.println("Triangle type is: Isosceles");

        return "Isosceles Triangle";

        }
        else if (sideA != sideB && sideA != sideC && sideB != sideC) {

        System.out.println("Triangle type is: Scalene");

        return "Scalene Triangle";

        }

        return "";  
    }


    public static void main(String[] args) {

       Triangle triangle = new Triangle(20, 15, 15);

       triangle.getTriangleType();
       triangle.getArea();
    }
}
