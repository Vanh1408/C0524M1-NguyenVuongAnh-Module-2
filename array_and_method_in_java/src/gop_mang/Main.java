package gop_mang;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array1 length: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Input array2 length: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++){
            System.out.println("Input array1 element: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++){
            System.out.println("Input array2 element: ");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++){
            arr3[size1 + i] = arr2[i];
        }
        System.out.println("Array 3: ");
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
