public class Fibonacci {
    // Function to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example value for nth Fibonacci number
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
