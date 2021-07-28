public class Day2Problem6Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year\n");
        int year = sc.nextInt();
        if(isLeapYear(year)) {
            System.out.println(year+ " is leap year");
        } else {
            System.our.println(year+ " is non-leap year");
        }
    }
    static boolean isLeapYear(int year) {
        boolean isLeap = false; 
        if(year % 400 == 0) {
            isLeap = true;
        } else if(year % 100 == 0) {
            isLeap = false;
        } else if(year % 4 == 0) {
            isLeap = true;
        }
        return isLeap;
    }
}
