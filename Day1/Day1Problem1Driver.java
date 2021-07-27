public class Day1Problem1Driver {
        public static void main(String args[]) {

                int first = 10;
                int second = 20;
                System.out.println("Before swapping first: "+ first+ ", second: "+ second);
                int temp = first;
                first = second;
                second = temp;
                System.out.println("After swapping first: "+ first+ ", second: "+ second);
        }
}
