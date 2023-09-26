package projectCodes2;
/*
Q9
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */
public interface Shape {
    double calculateArea();//behaviors that a class implements
    double calculatePerimiter();

}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        //area of a circle is 3.14 * r^2
        return 3.14*radius*radius;

    }

    @Override
    public double calculatePerimiter() {
        //circumference of a circle 2 * 3.14 * r
        return 2 * 3.14 * radius;

    }
}
class Square implements Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    @Override

    public double calculateArea() {
        //area of a square = side^2
        return side*side;
    }
    @Override

    public double calculatePerimiter() {
        //perimerter of a square= 4*side
        return 4 * side;
    }

    public static void main(String[] args) {
        Circle circle=new Circle(5.0);
        //print the area and perimeter of the circle
        System.out.println("Circle Area: "+circle.calculateArea());
        System.out.println("Circle Perimeter is : "+circle.calculatePerimiter());

        Square square=new Square(8.0);
        System.out.println("Square Area: "+square.calculateArea());
        System.out.println("Square Perimeter is : "+square.calculatePerimiter());

    }
}


