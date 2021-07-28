public class Day2Problem3Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong numbers\n");
        int num = sc.nextInt();
        if(isArmstrong(num))
            System.our.println(num+ " is an Armstrong number");
        else
            System.our.println(num+ " is not an Armstrong number");
    }

    static boolean isArmstrong(int num) {
        int temp, digits = 0, last = 0, sum = 0;   
        temp = num;
        while(temp > 0) {   
            temp = temp/10;   
            digits++;   
        }   
        temp = num;   
        while(temp > 0) {
            last = temp % 10;
            sum +=  (Math.pow(last, digits)); 
            temp = temp/10;  
        } 
    } 
}
