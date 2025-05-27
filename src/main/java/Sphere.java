public class Sphere extends Circle {
//area is just 4*pi*r^2
// volume is just 4/3*pi*r^3
    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        return 4*Math.PI*this.radius*this.radius; // multiplying radius 2 times is the same as r^2
    }

    public double volume() {
        return 4*Math.PI*this.radius*this.radius*this.radius/3; // again. muliplying raidus 3 times is the same as r^3
    }

}