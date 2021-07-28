public class Day2Problem1Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime\n");
        int num = sc.nextInt();
        if(isPrime(num))
            System.our.println(num+ " is a prime number");
        else
            System.our.println(num+ " is not a prime number");
    }

    public static boolean isPrime(int num) {

        // 0 and 1 are not prime
        if(num == 0 || num == 1) {
            return false;
        }
        // special check for 2
        if(num == 2) return true;
        // rest of the numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
    }
}
