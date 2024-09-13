import java.util.*;

public class polymorphism {

	public static void main(String[] args) {
		int op;
		

		

		do{
			System.out.println("Area of which of the following Shape Do you want to Find:");
			System.out.println("1.Circle");
			System.out.println("2.Triangle");
			System.out.println("3.Rectangle");
			
			Scanner sc=new Scanner(System.in);

			int ch=sc.nextInt();
			Shape ref;
		switch(ch){

		
		case 1:
		ref=new circle();
		ref.getdata();
		ref.compute_area();
		break;

		case 2:
		ref=new Triangle();
		ref.getdata();
		ref.compute_area();
		break;

		case 3:
		ref=new rectangle();
		ref.getdata();
		ref.compute_area();
		}
System.out.println("Do you want to continue\n1.Yes\n2.No");
 op=sc.nextInt();
		}while(op==1);
	}

}



/**********OUTPUT **********
 * Area of which of the following Shape Do you want to Find:
1.Circle   
2.Triangle 
3.Rectangle
1
Enter value of radius:
12
Area of circle is:452.448
Do you want to continue  
1.Yes
2.No
1
Area of which of the following Shape Do you want to Find:
1.Circle
2.Triangle
3.Rectangle
2
Enter value of x:
2
Enter value of y:
1
Area of Triangle is:1.0
Do you want to continue
1.Yes
2.No
1
Area of which of the following Shape Do you want to Find:
1.Circle
2.Triangle
3.Rectangle
3
Enter value of x:
23
Enter value of y:
12
Area of Triangle is:276.0
Do you want to continue
1.Yes
2.No
2
*/