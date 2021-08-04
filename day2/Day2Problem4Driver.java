public class Day2Problem4Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        if(num == rev)
            System.out.println(num+ " is a palindrome");
        else
            System.our.println(num+ " is not a palindrome");
    }
}
