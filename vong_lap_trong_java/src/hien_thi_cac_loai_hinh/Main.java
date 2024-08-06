package hien_thi_cac_loai_hinh;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:

                break;
            case 2:
                int choice2 = sc.nextInt();
                System.out.println("1. top-left");
                System.out.println("2. top-right");
                System.out.println("3. bottom-left");
                System.out.println("4. bottom-right");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                switch (choice2) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No choice");
                }
                break;
            case 3:

                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }

    }
}
