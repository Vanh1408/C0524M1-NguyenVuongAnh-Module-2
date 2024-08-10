package xoa_phan_tu_khoi_mang;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, l;
        do{
            System.out.println("Input array length: ");
            n = sc.nextInt();
        }while(n <= 0);
        int[] arr = new int[n];
        for (i = 0; i < n; i++){
            System.out.println("Input array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input element x: ");
        int x = sc.nextInt();
        for (l = i = 0; i < n; i++){
            if(arr[i] != x){
                arr[l] = arr[i];
                l++;
            }
        }
        n = l;
        System.out.println("Array after delete element x: ");
        for (i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
