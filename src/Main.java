public class Main {
    public static void main(String[] args) {
        Cricle cricle1 = new Cricle();
        System.out.println(cricle1);
        System.out.println("dien tich hinh tron "+cricle1.getArea());
        System.out.println("chu vi hinh tron "+cricle1.getPremeter());
        Cricle cricle = new Cricle("green",4);
        System.out.println(cricle);
        System.out.println(cricle.getArea());
        System.out.println(cricle.getPremeter());
        Cylinder cylinder = new Cylinder(3.0,"blue",4);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getCylindricalVolumn());
    }
}
