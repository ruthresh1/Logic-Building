public class Day1Problem3Driver {
        public static void main(String args[]) {

                int first = 10;
                int second = 20;
                int thrid = 30;
                System.out.println("Before swapping first: "+ first+ ", second: "+ second+ ", third: "+ third);
                first = first + second + third;
                second = first - (second + third);
                third = first - (second + third);
                first = first - (second + third);
                System.out.println("After swapping first: "+ first+ ", second: "+ second+ ", third: "+ third);
        }
}
