## Day 6

### Questions SET
1. Convert given binary to decimal number
2. Convert given decimal to binary number
3. Convert given binary to octal number
4. Convert given Octal to decimal number
5. Convert given decimal to octal number

### Solution

1. 
```java
public class Day6Problem1Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of days\n");
		int days = scan.nextInt();
		int numberOfDaysInAYear = 365;
		int numberOfDaysInAWeek = 7;
		int years = days/numberOfDaysInAYear;
		int weeks = (days % numberOfDaysInAYear) / numberOfDaysInAWeek;
		days = days % numberOfDaysInAWeek;
		System.out.println("years: "+ years+ ", weeks:"+ weeks+ ", days: "+ days);
	}
}
// Output
Enter the number of days
```

2. Similar to the last problem
```java
public class Day6Problem2Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter measurement in inches\n");
                int inches = scan.nextInt();
		int oneFeetInInches = 12;
		int oneYardInInches = 36;
		int yards = inches / oneYardInInches;
		int feet = (inches % oneYardInInches) / oneFeetInInches;
		int calInches = inches % oneFeetInInches;
		System.out.println("yards: "+ yards+ ", feet: "+ feet+ ", inches"+ calInches);
        }
}
// Output
Enter measurement in inches
```

3. 
```java
public class Day6Problem3Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter n and x\n");
                int n = scan.nextInt();
		int x = scan.nextInt();
		int ans = 1;
		int num = x; 
		while(num >= 1) {
			ans = ans * n;
			num = num - 1;
		}
		System.out.println(n+ " ^ "+ x+ " = "+ ans);
        }
}
// Output
```

4. Finding sqare root of a number, returns -1 if its is not a perfect square
```java
public class Day6Problem4Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number\n");
		int num = sc.nextInt();
                System.out.println(findSqareRoot(num));
        }
}
// Output
```

5. Solving a quadratic equation of the form
```java
public class Day6Problem5Driver {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a, b, c\n");
		double a = scan.nextDouble();
	}
}
// Output

```

