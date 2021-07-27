public class Day1Problem2Driver {
        public static void main(String args[]) {

                int first = 10;
                int second = 20;
                System.out.println("Before swapping first: "+ first+ ", second: "+ second);
                first = first + second;
                second = first - second;
                first = first - second;
                System.out.println("After swapping first: "+ first+ ", second: "+ second);
        }
}
