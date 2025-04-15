package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area() {
        return width * height;
    }
    public double Perimetro() {
        return (width * 2) + (height * 2);
    }
    public double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    public String toString(){
        return null;
    }
}
