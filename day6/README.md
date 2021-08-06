## Day 6

### Questions SET
1. Convert given binary to decimal number
2. Convert given decimal to binary number
3. Convert given binary to octal number
4. Convert given Octal to decimal number
5. Convert given decimal to octal number

### Solution

1. Binary to decimal conversion
```java
public class Day6Problem1Driver {
    public static void main(String args[]) {

         Scanner scan = new Scanner(System.in);
	 System.out.println("Enter number in binary\n");
	 String binary = scan.nextLine();
	 int ans = 0, place = 0;
	 for(int i = binary.length() - 1; i >= 0; i--) {
	     if(binary.charAt(i) == '1') 
	         ans += Math.pow(2, place);
	     place++;
	 }
	 System.out.println(ans);
    }
}
// Output
Enter number in binary
1010
10
```

2. Decimal to binary conversion
```java
public class Day6Problem2Driver {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number\n");
        int num = scan.nextInt();
	StringBuilder binary = new StringBuilder();
	while(num > 0) {
	    binary.append(num % 2);
	    num = num / 2;
	}
	binary.reverse(); // to reverse the order
	System.out.println("Binary: "+ binary.toString());
    }
}
// Output
Enter a number
10
Binary: 1010
```

3. Binary to octal conversion
```java
public class Day6Problem3Driver {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number\n");
        int binary = scan.nextInt();
	int decimal = 0, place = 0;
        for(int i = binary.length() - 1; i >= 0; i--) {
            if(binary.charAt(i) == '1')
                decimal += Math.pow(2, place);
            place++;
        }
	int octal = 0;
        while(decimal != 0) {
            octal += decimal % 8;
            decimal /= 8;
        }
	System.out.println("Octal: "+ ans);
    }
}
// Output
Enter a binary number
1010
8
```

4. Octal to decimal conversion
```java
public class Day6Problem4Driver {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number in octal\n");
	int octal = sc.nextInt();
	int decimal = 0;
	int exp = 0;
	while(octal > 0) {
	    decimal += Math.pow(8, exp);
	    octal = octal / 10;
	    exp++;
	}
        System.out.println(decimal);
    }
}
// Output
Enter a number in octal
8
10

```

5. Decimal to octal conversion
```java
public class Day6Problem5Driver {
    public static void main(String args[]) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number\n");
	int decimal = scan.nextInt();
	int octal = 0;
	while(decimal != 0) {
	    octal += decimal % 8;
	    decimal /= 8;
	}
	System.out.println("Octal: "+ octal);
    }
}
// Output
Enter a number
8
Octal: 10
```

