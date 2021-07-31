public class Day3Problem4Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        int factorial = 1;
        while(num > 1) {
            factorial = factorial * num;
            num = num - 1;
        }
        System.out.println("The factorial is "+ factorial);
    }
}
