package xay_dung_lop_quadratic_equation;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = sc.nextDouble();
        System.out.println("Input b: ");
        double b = sc.nextDouble();
        System.out.println("Input c: ");
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double delta = qe.getDiscriminant();
        System.out.println("The equation has been solved!!!");
        if(delta > 0){
            double root1 = qe.getRoot1();
            double root2 = qe.getRoot2();
            System.out.println("The equation has two root: " + root1 + " and " + root2);
        }else if(delta == 0){
            double root = qe.getRoot1();
            System.out.println("The equation has one roots: " + root);
        }else {
            System.out.println("The equation has no roots!!!");
        }
    }
}
