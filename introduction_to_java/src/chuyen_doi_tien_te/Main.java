package chuyen_doi_tien_te;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your USD price: ");
        double price = sc.nextDouble();
        double rate = 23000;
        double total = price * rate;
        System.out.println("Your VND price is: " + total + " dong");
    }
}
