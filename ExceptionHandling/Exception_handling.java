public class Exception_handling {


	public static void main(String[] args) {

		arithmetic_operation a=new arithmetic_operation();
		
		// a.getdata();
		// a.division();
		a.display();
		System.out.println("I Am In Main Method");
		
	}

}




/*****OUTPUT******* 
Num 1:
11
Num 2:
a
You Entered String insted of Number
java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:943)
        at java.base/java.util.Scanner.next(Scanner.java:1598)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
        at arithmetic_operation.<init>(arithmetic_operation.java:15)
        at Exception_handling.main(Exception_handling.java:8)
Num 1:
5
Num 2:
0
Denominator is 0
java.lang.ArithmeticException: / by zero
        at arithmetic_operation.<init>(arithmetic_operation.java:17)
        at Exception_handling.main(Exception_handling.java:8)
Num 2:
5
Division of Number is:1
I Am In Main Method */
























