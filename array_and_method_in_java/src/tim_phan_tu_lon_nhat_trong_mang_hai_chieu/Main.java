package tim_phan_tu_lon_nhat_trong_mang_hai_chieu;

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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxValue = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Max value is: " + maxValue + ", position: [" + maxRow + "][" + maxCol + "]");

    }
}
