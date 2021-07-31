public class Day3Problem5Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number upto which to print fibbonacci sequence\n");
        int num = sc.nextInt();
        int fib1 = 1, fib2 = 1;
        int currentFib = 0;
        System.out.println(fib1);
        System.out.println(fib2);
        while(currentFib < num) {
            currentFib = fib1 + fib2;
            System.out.println(currentFib);
            fib1 = fib2;
            fib2 = currentFib;
        }
    }
}

