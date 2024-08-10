package them_phan_tu_vao_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 0; i < N; i++){
            System.out.println("Input array element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input element X: ");
        int X = sc.nextInt();
        System.out.println("Input index you want to put element X: ");
        int index = sc.nextInt();
        if (index < 0 || index > N){
            System.out.println("Index out of bounds!");
        }else {
            for (int i = N; i > index; i--){
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
            N++;
            for (int i = 0; i < N; i++){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
