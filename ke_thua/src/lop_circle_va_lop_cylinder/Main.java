package lop_circle_va_lop_cylinder;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4,5,"Red");
        Cylinder cylinder2 = new Cylinder(7,3,"Green");
        Cylinder cylinder3 = new Cylinder(6,4,"Blue");

        List<Cylinder> list = new ArrayList<Cylinder>();
        list.add(cylinder);
        list.add(cylinder2);
        list.add(cylinder3);

        for (Cylinder c : list) {
            System.out.println(c.toString());
            System.out.println("Volume: " + c.getVolume());
        }
    }
}
