package lop_point_va_moveablepoint;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(3,4,1,2);
        MovablePoint p2 = new MovablePoint(2,2,5,4);

        List<MovablePoint> list = new ArrayList<MovablePoint>();
        list.add(p);
        list.add(p2);

        for (MovablePoint p1 : list) {
            System.out.println(p1.toString());
            System.out.println(p1.move());
        }
    }
}
