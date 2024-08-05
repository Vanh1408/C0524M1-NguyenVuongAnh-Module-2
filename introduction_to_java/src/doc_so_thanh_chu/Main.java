package doc_so_thanh_chu;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 0 and 999: ");
        int number = sc.nextInt();
        if (number >= 0 && number <= 999) {
            System.out.println("Your number in String is: " + numberToWords(number));
        }else {
            System.out.println("Invalid input");
        }
    }
    public static String numberToWords(int number) {
        String[] onesToNine = {"","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] ty = {"","","twenty", "thirty", "forty", "fifth-ty", "sixty", "seventy", "eighty", "ninety"};
        String result = "";

        if (number == 0) {
            return "zero";
        } else if (number >= 100) {
            result += onesToNine[number / 100] + " hundred";
            number %= 100;
            if (number > 0) {
                result += " and ";
            }
        }

        if (number >= 20) {
            result += teens[number / 10];
            if (number % 10 > 0) {
                result += " " + onesToNine[number % 10];
            }
        } else if (number >= 10) {
            result += teens[number - 10];
        } else if (number > 0) {
            result += onesToNine[number];
        }
        return result;
    }
}
