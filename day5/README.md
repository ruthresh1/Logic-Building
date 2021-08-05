## Day 5

### Questions SET
1. Convert given days into years, weeks, days 
2. Given measurement in inches, convert it to yards, feet, inches.
3. Given n, x find n^x without using built-in function
4. Find the square root of a given number
5. Find all the roots of a given quadratic equation.

### Solution

1. Just simple division, you've to just know how much the length of each is.
1 year = 365 days
1 week = 7 days
```java
public class Day5Problem1Driver {
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
375
years: 1, weeks: 1, days: 3
```

2. Similar to the last problem
1 yard = 36 inchesi = 3 feet
1 feet = 12 inches
```java
public class Day5Problem2Driver {
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
50
yards: 1, feet: 1, inches: 2
```

3. 
```java
public class Day5Problem3Driver {
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
Enter n and x
2
3
2 ^ 3 = 8
```

4. Finding sqare root of a number, returns -1 if its is not a perfect square
```java
public class Day5Problem4Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number\n");
		int num = sc.nextInt();
                System.out.println(findSqareRoot(num));
        }
	static int findSqareRoot(int num) {
		int i = 1;
		while(i * i <= num) {
			if(i * i == num) {
				return i;
			i++;
		}
		return -1;
	}
}
// Output
Enter a number
25
5
```
5. Solving a quadratic equation of the form

ax^2 + bx + c = 0
Find the determinant
if det is negative there are no real roots
if det is 0 the roots are same
else it has to be calculated using formula
```java
public class Day5Problem5Driver {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a, b, c\n");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double det = Math.pow(b, 2) - 4 * a * c;
		double root1 = 0, root2 = 0;
		if(det < 0) {
			System.out.println("There are no real roots");
			System.exit(0);
		} else if(det == 0) {
			root1 = -b / (2.0 * a);
			root2 = root1;
		} else {
			root1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			root2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
		}
		System.out.println("The roots are "+ root1+ ", "+ root2);
	}
}
// Output
Enter a, b, c
1
-2
1
The roots are 1.0, 1.0

```

