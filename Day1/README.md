### Day 1

### First three basic questions

1. Write a program to swap two numbers using a third variable!
2. Write a program to swap two numbers without using a third variable!
3. Write a program to swap three numbers without using a fourth variable!


### Solution
1. This one is easy, basic swapping operation that includes a third temporary variable
```java
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
// Output
Before swapping first: 10, second: 20
After swapping first: 20, second: 10
```

2. The solution for this is a little mathematical, only by substituting and checking for values can you believe this stuff really works
```java
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
// Output
Before swapping first: 10, second: 20
After swapping first: 20, second: 10
```


3. This one I had to google to find how to swap around 3 numbers, its similar to the previous one but the ordering is important
```java
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
// Output
Before swapping first: 10, second: 20, third: 30
After swapping first: 30, second: 10, third: 20
```

## Links for further reference
1. https://www.educba.com/swapping-in-java
2. https://www.geeksforgeeks.org/swap-three-variables-without-using-temporary-variable
