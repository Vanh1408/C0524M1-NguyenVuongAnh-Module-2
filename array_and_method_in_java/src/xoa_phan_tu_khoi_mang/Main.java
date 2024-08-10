package xoa_phan_tu_khoi_mang;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            System.out.println("Input array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input element x: ");
        int x = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < N; i++){
            if(arr[i] == x){
                index_del = i;
                break;
            }
        }
        if (index_del != -1){
            for (int i = index_del; i < N - 1; i++){
                arr[i] = arr[i+1];
            }
            N--;
            System.out.println("Array after delete element x: ");
            for (int i = 0; i < N; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
