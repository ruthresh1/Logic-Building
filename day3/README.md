##Day 3

### Question Set
1. Find the number of digits in a given number!
2. Find the largest among 3 numbers!
3. Determine if the given character is a vowel or consonant!
4. Find the factorial of a given number!
5. Print Fibbonacci sequence upto or less than the given number!


### Solution
1. This is straight forward just count the number of time you can divide a number by 10
```java
public class Day3Problem1Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
	int ans = 0;
	while(num != 0) {
	    num = num/10;
	    ans++;
	}
	System.out.println("The number has "+ ans+ " digits");
    }
}
// Output
Enter a number
100
The number has 3 digits
```

2. You can only compare only 2 at a time
```java
public class Day3Problem2Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers\n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if(num1 > num2) {
	    if(num1 > num3) {
	        ans = num1;
	    } else {
	        ans = num3;
	    }
	} else if(num2 > num3) {
	    ans = num2;
	} else {
	    ans = num3;
	}
        System.out.println("The largest number is "+ ans);
    }
}
// Output
Enter 3 numbers
10
30
20
The largest number is 30

```

```java
// a simpler way
public int max(int num1, int num2, int num3) {
    return Math.max(num1, Math.max(num2, num3));
}
```

3. a e i o u are vowels rest consonants
```java
public class Day3Problem3Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character\n");
        char ch = sc.nextChar();
	switch(ch) {
	    case 'A':
	    case 'E':
	    case 'I':
	    case 'O':
	    case 'U':
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	        System.out.println("Vowel");
	    default:
	        System.out.println("Consonant");
	}
    }
}
// Output
Enter a character
A
Vowel

```

4. Factorial of 4! = 4 X 3 X 2 X 1 = 24
```java
public class Day3Problem4Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
	int factorial = 1;
	while(num > 1) {
	    factorial = factorial * num;
	    num = num - 1;
	}
        System.out.println("The factorial is "+ factorial);
    }
}
// Output
Enter a number
4
The factorial is 24
```

5. Assuming Fibbonacci sequence starts from 1
Fibbonacci sequence 1 1 2 3 5 8 13 21 34 
```java
public class Day3Problem5Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number upto which to print fibbonacci sequence\n");
        int num = sc.nextInt();
	int fib1 = 1, fib2 = 1;
        int currentFib = 0;
	System.out.println(fib1);
	System.out.println(fib2);
        while(currentFib < num) {
	    currentFib = fib1 + fib2;
            System.out.println(currentFib);
	    fib1 = fib2;
	    fib2 = currentFib;
	}
    }
}
// Output
Enter a number upto which to print fibbonacci sequence
9
1 1 2 3 5 8
```



