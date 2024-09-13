import java.util.*;

public class arithmetic_operation {
	private int num1,num2,num3;
	
	public arithmetic_operation() {
		int flag=0;
		do{
			
		try {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Num 1:");
		    num1=sc.nextInt();
			System.out.println("Num 2:");
			num2=sc.nextInt();
		    num3=num1/num2;
			flag=1;
			
			
			
		}
		
	catch(ArithmeticException e){
		Scanner sc=new Scanner(System.in);
					do{
						
					System.out.println("Denominator is 0");
					e.printStackTrace();
					System.out.println("Num 2:");
				    num2=sc.nextInt();
					}while(num2==0);
					num3=num1/num2;
			}		
		
		catch(InputMismatchException n){
			System.out.println("You Entered String insted of Number");
			n.printStackTrace();
			
		}
		
		// catch(RuntimeException a) {
		// 	System.out.println("Exception caught");
		// 	a.printStackTrace();
			
		// }
		// catch(Exception a) {
		// 	System.out.println("Division is not Possible");
		// 	a.printStackTrace();
			
		// }
	}while(flag==0);
	//many catch blocks can only be writ
	}

	
	public  arithmetic_operation(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		
		
	}
	
	
	public void display() {
		System.out.println("Division of Number is:"+num3);
		
	}

}
