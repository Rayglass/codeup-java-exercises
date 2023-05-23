package shapes;

public class Circle {
    private double radius;

//    RADIUS OF CIRCLE
    public Circle(double radius) {
        this.radius = radius;
    }

//    GETTER
    public double getRadius() {
        return radius;
    }

//    SETTER
    public void setRadius(double radius) {
        this.radius = radius;
    }

//    AREA OF CIRCLE
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }



//    CIRCUMFERENCE OF CIRCLE
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}