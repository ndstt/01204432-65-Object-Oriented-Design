package excercise.week1;

public class Circle {
    private double radius;
    private String color;
   
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
   
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }
   
    public double getRadius() {
        return radius; 
    }
   
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + 
                ",color=" + this.color + "]";
    }
}
