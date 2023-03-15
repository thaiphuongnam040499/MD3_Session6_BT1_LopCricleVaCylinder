public class Cylinder extends Cricle{
    private Double height = 2.0;

    public Cylinder(Double height,String color,double radius) {
        super(color,radius);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    public double getCylindricalVolumn(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Thể tích hình trụ" + getCylindricalVolumn() +
                '}';
    }
}
