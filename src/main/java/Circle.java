public class Circle {
    private double radius;
    private String color = " red";

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(2.5,"blue");
        System.out.println(circle);

        circle = new Cylinder(5,2.5,"Black");
        System.out.println(circle);
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;


    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle of color : " + getColor()
                + " , Circle with radius = :" + getRadius()
                + ", Circle of Area = :  " + getArea()
                ;
    }
}
