## Day 7

### Questions set
1. Write a Simple calculator program
2. Check if the given number is a perfect number
3. Find the grade of a given student
4. Find square of n natural numbers
5. Check if a given number is unique or not

### Solutions
1. A simple use case of determining input and performing operations accordingly
```java
public class Day7Problem1Driver {
    public static void main(String args[]) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Choose operation to perform");
	 System.out.println("to add enter +");
	 System.out.println("to subtract enter -");
	 System.out.println("to multiply enter *");
	 System.out.println("to divide enter /");
         String op = scan.nextLine();
	 System.out.println("Enter two numbers\n");
	 int num1 = scan.nextInt();
	 int num2 = scan.nextInt();
	 int result = 0;
	 switch(op) {
	     case "+": 
	         result = num1 + num2;
		 break;
	     case "-":
	         result = num1 - num2;
		 break;
	     case "*":
	         result = num1 * num2;
		 break;
	     case "/":
	         result = num1 / num2;
		 break;
	     default: 
	         System.out.println("Operation not supported");
		 System.exit(0);
         }
	 System.out.println(num1+ " "+ op+ " "+ num2+ " = "+ result);
    }
}
// Output
Choose operation to perform
to add enter +
to subtract enter -
to multiply enter *
to divide enter /
*
2
3
2 * 3 = 6
```

2. A number is perfect if the sum of its positive divisors excluding the number itself is equal to that number
Eg. 28
1 + 2 + 4 + 7 + 14 = 28
```java
public class Day7Problem2Driver {
    public static void main(String args[]) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number\n");
         int num = scan.nextInt();
	 int sum = 0;
	 for(int i = 1; i < num; i++) {
	     if(num % i == 0) {
	         sum += i;
	     }
	 }
	 if(num == sum) {
             System.out.println(num+ " is a perfect number);
	 } else {
	     System.out.println(num+ " is not a perfect number);
	 }
    }
}
// Output
Enter a number
28
28 is a perfect number
```

3. Determining range
```java
public class Day7Problem3Driver {
    public static void main(String args[]) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter number in binary\n");
         String binary = scan.nextLine();
         System.out.println(ans);
    }
}
// Output
Enter number in binary
```

4. 
```java
public class Day7Problem4Driver {
    public static void main(String args[]) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter number in binary\n");
         String binary = scan.nextLine();
         System.out.println(ans);
    }
}
// Output
Enter number in binary
```

5. 
```java
public class Day7Problem5Driver {
    public static void main(String args[]) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter number in binary\n");
         String binary = scan.nextLine();
         System.out.println(ans);
    }
}
// Output
Enter number in binary
```


