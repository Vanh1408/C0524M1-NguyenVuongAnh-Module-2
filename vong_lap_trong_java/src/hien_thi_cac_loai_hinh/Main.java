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
                printRectangle();
                break;
            case 2:
                System.out.println("1. top-left");
                System.out.println("2. top-right");
                System.out.println("3. bottom-left");
                System.out.println("4. bottom-right");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        printTriangle(choice2);
                        break;
                    case 2:
                        printTriangle(choice2);
                        break;
                    case 3:
                        printTriangle(choice2);
                        break;
                    case 4:
                        printTriangle(choice2);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No choice");
                }
                break;
            case 3:
                printIsoscelesTriangle();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }

    }

    public static void printRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height");
        int n = sc.nextInt();
        System.out.println("Input length");
        int m = sc.nextInt();
        System.out.println("Your rectangle !!!");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int choice){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height");
        int h = sc.nextInt();
        if(choice == 1){
            System.out.println("Your triangle !!!");
            for(int i=0; i<h; i++){
                for(int j=h; j>i; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(choice == 2){
            System.out.println("Your triangle !!!");
            for(int i=0; i<h; i++){
                for(int j=h; j>0; j--){
                    if(j<=h-i){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else if(choice == 3){
            System.out.println("Your triangle !!!");
            for(int i=0; i<h; i++){
                for(int j=0; j<i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(choice == 4){
            System.out.println("Your triangle !!!");
            for(int i=1; i<=h; i++){
                for(int j=h; j>0; j--){
                    if(j<=i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void printIsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height");
        int h = sc.nextInt();
        System.out.println("Your isosceles triangle !!!");
        for(int i=1; i<=h; i++){
            for(int j=i; j<h; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
