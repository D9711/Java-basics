public class Rectangle {

    private double height;
    private double width;

public double getHeight(){
    return height;
}
 public double getWidth(){
    return width;
}
public void setHeight(double newHeight){
    height = newHeight;
}
public void setWidth(double newWidth){
    width = newWidth;
}

 public double area() {
    double area = height * width;

    return area;
}

 public double diagonalLength(){
    double diagonal = Math.sqrt((Math.pow(width, 2) + (Math.pow(height, 2))));

    return diagonal;
}

 public boolean isSquare(){
    if(width == height){

    return true;

    }
    else {

    return false;
    }
 }
}
