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
1 yard = inches
1 feet = 12 inches
```java
public class Day5Problem2Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a character\n");
                char ch = scan.nextChar();
        }
}
// Output
Enter 
```

3. 
```java
public class Day5Problem3Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 3 numbers\n");
                int num1 = scan.nextInt();
		int num2 = scan.nextInt();
        }
}
// Output
Enter 3 numbers
2
3
```

4. Basics of Random number generation, usually it's sudo random
```java
public class Day4Problem4Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Generating a random number between 0 and 100\n");
                System.out.println(generateRandom());
        }
	static int generateRandom() {
	}
}
// Output
Generating a random number between 0 and 100
20
```

