package trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input random percentage between 1 and 100: ");
        double percent = sc.nextInt();
        if (percent <= 100 && percent >= 1) {
            Circle circle = new Circle(3.5);
            Circle circle2 = new Circle(5.5);
            Rectangle rectangle = new Rectangle(2.3, 5.8);
            Rectangle rectangle2 = new Rectangle(2.5, 3.8);
            List<Circle> circles = new ArrayList<>();
            circles.add(circle);
            circles.add(circle2);
            List<Rectangle> rectangles = new ArrayList<>();
            rectangles.add(rectangle);
            rectangles.add(rectangle2);

            for (Circle c : circles) {
                System.out.println("Circle's Area: " + c.getArea());
                c.resize(percent);
            }

            for (Rectangle r : rectangles) {
                System.out.println("Rectangle's Area: " + r.getArea());
                r.resize(percent);
            }
        }else{
            System.out.println("Invalid percentage!!!");
        }
    }
}
