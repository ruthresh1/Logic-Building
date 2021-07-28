public class Day2Problem2Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to be reversed\n");
        int num = sc.nextInt();
        int rev = 0;
        while(num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The reversed number is "+ rev);
    }
}
