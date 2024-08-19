package lop_circle_va_lop_cylinder;

class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * 2 * getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "Radius: " + super.getRadius() +
                ", Height: " + height +
                ", Color: " + getColor();
    }
}
