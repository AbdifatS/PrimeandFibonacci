public class PrimeAndFibonacci {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to display prime numbers between 1 and 500
    public static void displayPrimes() {
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to find the sum of even-valued terms in the Fibonacci sequence up to a given limit
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int latest = 1;
        int last = 2;
        while (last <= limit) {
            if (last % 2 == 0) {
                sum += last;
            }
            int temp = last;
            last = latest + last;
            latest = temp;
        }
        return sum;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");
        displayPrimes();
        System.out.println("\nSum of even-valued terms in the Fibonacci sequence up to 4 million: " + sumEvenFibonacci(4000000));
    }
}
