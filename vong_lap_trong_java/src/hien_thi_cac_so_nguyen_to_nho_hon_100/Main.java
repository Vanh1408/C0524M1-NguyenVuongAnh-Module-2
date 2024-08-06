package hien_thi_cac_so_nguyen_to_nho_hon_100;

class Main {
    public static void main(String[] args) {
        int N = 2;
        System.out.println("Prime numbers smaller than 100: ");
        while (N < 100) {
            if (isPrime(N)) {
                System.out.print(N + " ");
            }
            N++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1){
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
