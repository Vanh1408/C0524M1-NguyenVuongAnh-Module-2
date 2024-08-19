package lop_point_2D_va_lop_point_3D;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Point3D point = new Point3D(4,5,6);
        Point3D point2 = new Point3D(1,2,3);
        Point3D point3 = new Point3D(2,3,4);

        List<Point3D> points = new ArrayList<>();
        points.add(point);
        points.add(point2);
        points.add(point3);

        for (Point3D p : points) {
            System.out.println(p.toString());
        }

    }
}
