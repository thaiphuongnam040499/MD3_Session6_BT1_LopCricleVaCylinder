public class Cricle {
    private String color="yellow";
    private double radius=2.0;

    public Cricle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public Cricle(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPremeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "color" + color +
                "A circle with radius=" + getRadius() + '\'' +
                '}';
    }
}
