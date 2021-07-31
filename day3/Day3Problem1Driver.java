public class Day3Problem1Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        int ans = 0;
        while(num != 0) {
            num = num/10;
            ans++;
        }
        System.out.println("The number has "+ ans+ " digits");
    }
}
