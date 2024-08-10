package tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers of rows in array: ");
        int rows = sc.nextInt();
        System.out.println("Input numbers of columns in array: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Input number at row " + i + " and column " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int minValue = arr[0][0];
        int minRow = 0;
        int minCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        System.out.println("Max value is: " + minValue + ", position: [" + minRow + "][" + minCol + "]");
    }
}
