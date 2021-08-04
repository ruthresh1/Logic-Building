## Day 4

### Question SET
1. Print the ascii code of given character!
2. Check if a given character is in lowercase, uppercase, is a digit or special character!
3. Find the sum and average of given 3 numbers!
4. Generate a random number between 0 and 100

### Solution

1. ASCII - American standard code for information interchange
```java
public class Day4Problem1Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character\n");
		char ch = scan.nextChar();
		System.out.println("The ASCII code for "+ ch+ " is "+ (int)ch);
	}
}
// Output
Enter a character
A
The ASCII code for A is 65
```

2. use the ascii code to limit the range of what a character can be.
```java
public class Day4Problem1Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a character\n");
                char ch = scan.nextChar();
		int ascii = (int) ch;
		if(ch >=97 && ch <=122)
                	System.out.println(ch+ " is a lower case alphabet");
		else if(ch >=65 && ch <=90)
                        System.out.println(ch+ " is an upper case alphabet");
		else if(ch >=48 && ch <=57)
                        System.out.println(ch+ " is a digit");
		else
                        System.out.println(ch+ " is a special character");
        }
}
// Output
Enter a character
A
A is an upper case alphabet
```

3. Basic mathematics just getting numbers working together.
```java
public class Day4Problem3Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 3 numbers\n");
                int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int sum = num1+ num2+ num3;
		System.out.println("The sum is "+ sum+ ", the average is "+ (float)sum/3);
        }
}
// Output
Enter 3 numbers
1
2
3
2.0
```

4. Basics of Random number generation, usually it's sudo random
```java
import java.util.Random;
public class Day4Problem4Driver {
        public static void main(String args[]) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Generating a random number between 0 and 100\n");
                System.out.println(generateRandom(0, 100));
        }
	static int generateRandom(int low, int high) {
		Random random = new Random();
		return random.nextInt(high - low) + low;
	}
}
// Output
Generating a random number between 0 and 100
20
```

