public class Day3Problem2Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers\n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2) {
            if(num1 > num3) {
                ans = num1;
            } else {
                ans = num3;
            }
        } else if(num2 > num3) {
            ans = num2;
        } else {
            ans = num3;
        }
        System.out.println("The largest number is "+ ans);
    }
}
