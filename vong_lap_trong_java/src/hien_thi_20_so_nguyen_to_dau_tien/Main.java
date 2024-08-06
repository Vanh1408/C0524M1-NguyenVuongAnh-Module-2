package hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of elements: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        System.out.println("Prime numbers: ");
        while (count <= numbers) {
            if (isPrime(N)) {
                if (count == numbers){
                    System.out.print(N);
                }else{
                    System.out.print(N + ", ");
                }
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
