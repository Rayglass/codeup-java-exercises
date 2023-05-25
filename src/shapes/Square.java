package shapes;

// 6.Change your existing Square class to extend Quadrilateral.

public class Square extends Quadrilateral {

// 1.Remove the code from the body of your Rectangle and Square classes.
    public Square(double length) {
        super(length, length);
    }

// Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
    @Override // implement Quadrilateral
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override // implement Quadrilateral
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override // implement Measurable
    public double getPerimeter() {
        return 4 * length;
    }

    @Override // implement Measurable
    public double getArea() {
        return length * width;
    }

}

//package shapes;
//
//public class Square extends Rectangle {
//    public Square(int side) {
//        super(side, side);
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(length, 2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * length;
//    }}
