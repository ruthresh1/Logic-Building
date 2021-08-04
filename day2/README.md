## Day 2

#### Set 2 basic questions

1. Write a program to check if a given number is prime number or not!
2. Write a program to reverse a number!
3. Write a program to check if a given number is Armstrong number!
4. Write a program to check if a given number is palindrome or not!
5. Write a program to check if a given number is even or odd!
6. Write a program to check if whether a given year is Leap year or not!


### Solution

1. a number is prime if it is divisible by 1 and itself only, so it should not be divisible by numbers in between 1 and itself
a trick to reduce time complexity is to only iterate till sqare root of num, along with skipping even numbers
```java
public class Day2Problem1Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime\n");
        int num = sc.nextInt();
        if(isPrime(num))
            System.our.println(num+ " is a prime number");
        else
            System.our.println(num+ " is not a prime number");
    }

    public static boolean isPrime(int num) {

        // 0 and 1 are not prime
        if(num == 0 || num == 1) {
            return false;
        }
        // special check for 2
        if(num == 2) return true;
        // rest of the numbers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
    }
}
```

2. The solution for this is little mathematical, just substituted values to check if the logic holds
```java
public class Day2Problem2Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to be reversed\n");
        int num = sc.nextInt();
        int rev = 0;
        while(num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The reversed number is "+ rev);
    }
}
```

3. Armstrong number, formally defined with the number of digits it contains, its better explained through some examples
1 = 1 ^ 1                          // is Armstrong number
31 != 3 ^ 2 + 1 ^ 2 = 10           // is not Armstrong number
153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153  // is Armstrong number
```java
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
```

4. Just reverse the number and check if they are equal
```java
public class Day2Problem4Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        if(num == rev)
            System.out.println(num+ " is a palindrome");
        else
            System.our.println(num+ " is not a palindrome");
    }
}
```

5. Odd or even
```java
public class Day2Problem5Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num+ " is even");
        } else {
            System.our.println(num+ " is odd");
        }
    }
}
```

6. Because a year is not exactly 365 days, we have leap years, which satisfy 3 conditions
* year should be divisible by 400
* year should not be divisible by 100
* year should be divisible by 4
```java
public class Day2Problem6Driver {
	public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year\n");
        int year = sc.nextInt();
        if(isLeapYear(year)) {
            System.out.println(year+ " is leap year");
        } else {
            System.our.println(year+ " is non-leap year");
        }
    }
    static boolean isLeapYear(int year) {
        boolean isLeap = false; 
        if(year % 400 == 0) {
            isLeap = true;
        } else if(year % 100 == 0) {
            isLeap = false;
        } else if(year % 4 == 0) {
            isLeap = true;
        }
        return isLeap;
    }
}
``` 
