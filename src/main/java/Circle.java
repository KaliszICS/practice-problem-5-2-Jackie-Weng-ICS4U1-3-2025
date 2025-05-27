
public class Circle {

    protected double radius; // public and private. half and half. not as private as private but not as public as public

/* basic setters and getters */

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double diameter() {
        return 2*this.radius;
    }

    public double perimeter() {
        return 2*Math.PI*this.radius; // you could prob use 3.14 instead of math.pi buts its more precise and uses like 9 digits
    }

    public double area() {
        return Math.PI*this.radius*this.radius; // muilplying by radius twice is the same as r^2
    }

}