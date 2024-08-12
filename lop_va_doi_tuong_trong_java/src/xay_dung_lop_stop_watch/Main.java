package xay_dung_lop_stop_watch;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Time elapsed for selection sort: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
