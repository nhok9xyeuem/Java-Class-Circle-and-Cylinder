public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }
    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }



    public double getHeight() {
        return height;
    }

    public double getTheTichCylinder() {
        return height * getArea();
    }
//    @Override
//    public void setRadius(double radius){
//        setRadius(radius);
//    }
//
//    @Override
//    public double getArea() {
//        return super.getArea();
//    }

    @Override
    public String toString() {
        return super.toString()
                + " , Cylinder With Height = " + getHeight()
                + ", volume of Cylinder is =  " + getTheTichCylinder()
                ;
    }
}
