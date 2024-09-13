import java.util.* ;

public class Bag_Op {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in) ;
		Bag S[] = new Bag[20] ;
		int choice , c , Sr , count ;
		int i = 0 ;
		double weight ;
		String colour ;
		
		do
		{
			Bag temp ;
			
			System.out.println("Enter 1 to Insert Ball ") ;
			System.out.println("Enter 2 to Delete Ball ") ;
			System.out.println("Enter 3 to Swap") ;
			System.out.println("Enter 4 to Insert at Sr no. ") ;
			System.out.println("Enter 5 to Display ") ;
			System.out.print("\nEnter the choice : ") ;
			c = Sc.nextInt() ;
			
			switch(c)
			{
				case 1:
					do
					{
						System.out.println("\nEnter 1 to Insert default ball") ;
						System.out.println("Enter 2 to Add ball with input weight ") ;
						System.out.println("Enter 3 to Add ball with input colour ") ;
						System.out.println("Enter 4 to Add ball with both inputs \n") ;
						System.out.print("Enter the choice : ") ;
						choice = Sc.nextInt();
						
						switch(choice)
						{
							case 1 :
								S[i] = new Bag ();
								i++ ;
								System.out.println("\nEnter 5 to display added elemnts ");
								System.out.println("Enter 6 to End adding" + "\n\n"+ "OR" ) ;
								break ;
							case 2 :
								System.out.print("Enter the weight : ") ;
								weight = Sc.nextDouble();
								S[i] = new Bag ( weight ) ;
								i++ ;
								System.out.println("\nEnter 5 to display added elemnts ");
								System.out.println("Enter 6 to End adding" + "\n\n"+ "OR" ) ;
								break ;
							case 3 :
								System.out.print("Enter the colour : ") ;
								colour = Sc.next();
								S[i] = new Bag ( colour ) ;
								i++ ;
								System.out.println("\nEnter 5 to display added elemnts ");
								System.out.println("Enter 6 to End adding" + "\n\n"+ "OR" ) ;
								break ;
							case 4 :
								System.out.print("Enter the Weight : ") ;
								weight = Sc.nextDouble();
								System.out.print("Enter the colour : ") ;
								colour = Sc.next();
								S[i] = new Bag ( weight , colour ) ;
								i++ ;
								System.out.println("\nEnter 5 to display added elemnts ");
								System.out.println("Enter 6 to End adding" + "\n\n"+ "OR" ) ;
								break ;
							case 5 :
								System.out.println("Sr."+"\t"+"Weight"+"\t"+"colour") ;
								for(int j = 0 ; j < i ; j++)
								{
									System.out.print( j+1 + "." + "\t" );
									S[j].display();
								}
								Bag.output();
								System.out.println("\nEnter 6 to End adding" + "\n\n"+ "OR" ) ;
								break;
							case 6 :
								System.out.println("Operation has ended \n") ;
						}
						
					}while(choice != 6) ;
					break;
					
				case 2 :
					System.out.print("Enter the serial no. to delete the ball : ") ;
					Sr = Sc.nextInt() ;
					count = Bag.count();
					while(Sr < count)
						{
							S[Sr - 1] = S[Sr] ;
							Sr ++ ;
						}
					S[Sr-1].Correction();
					System.out.println("\nEnter 5 to End Operation"+"\n"+"OR") ;
					break;
					
				case 3 :
					int Sr1 , Sr2 ;
					System.out.print("Enter the Sr No. you want Swap : ") ;
					Sr1 = Sc.nextInt() ;
					System.out.print("\nEnter the Sr no. you want to Swap with : ") ;
					Sr2 = Sc.nextInt() ;
					temp = S[Sr1] ;
					S[Sr1 - 1] = S[Sr2 - 1] ;
					S[Sr2 - 1] = temp ;
					System.out.println("\nEnter 5 to End Operation"+"\n"+"OR") ;
					break ;
				case 4 :
					/*int Sr3 ;
					System.out.print("Enter the Sr no. at you want to insert") ;
					Sr3 =Sc.nextInt() ;
					S[i] = new Bag();
					i++ ;
					count = Bag.count() ;
					temp = S[count] ;
					while(count > Sr3 - 1)
					{	
						S[count] = S[count - 1] ;
						count -- ;
					}
					S[Sr3 - 1] = temp ;
					break */;		
				case 5 :
					System.out.println("Sr."+"\t"+"Weight"+"\t"+"colour") ;
					count = Bag.count() ;
					for(int j = 0 ; j < count ; j++)
					{
						System.out.print( j+1 + "." + "\t" );
						S[j].display();
					}
					Bag.output();
					System.out.println("\nEnter 5 to End Operation"+"\n"+"OR") ;
					break ;
				case 6 :
					System.out.println("Operation Ended") ;
			}
				
			
		}while (c != 6);
					
		Sc.close();
		

	}

}
/*
**************************************OutPut**************************************
Enter 1 to Insert Ball 
Enter 2 to Delete Ball 
Enter 3 to Display 

Enter the choice : 1

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 1

Enter 5 to display added elemnts 
Enter 6 to End adding

OR

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 1

Enter 5 to display added elemnts 
Enter 6 to End adding

OR

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 2
Enter the weight : 5

Enter 5 to display added elemnts 
Enter 6 to End adding

OR

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 3
Enter the colour : red

Enter 5 to display added elemnts 
Enter 6 to End adding

OR

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 4
Enter the Weight : 5
Enter the colour : Greeen

Enter 5 to display added elemnts 
Enter 6 to End adding

OR

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 5
Sr.	Weight	colour
1.	2.5	blue
2.	2.5	blue
3.	5.0	blue
4.	2.5	red
5.	5.0	Greeen
Total Weight of Bag is : 17.5
No. of balls in bag are : 5

Enter 6 to End adding

OR

Enter 1 to Insert default ball
Enter 2 to Add ball with input weight 
Enter 3 to Add ball with input colour 
Enter 4 to Add ball with both inputs 

Enter the choice : 6
Operation has ended 

Enter 1 to Insert Ball 
Enter 2 to Delete Ball 
Enter 3 to Display 

Enter the choice : 3
Sr.	Weight	colour
1.	2.5	blue
2.	2.5	blue
3.	5.0	blue
4.	2.5	red
5.	5.0	Greeen
Total Weight of Bag is : 17.5
No. of balls in bag are : 5
Enter 4 to End Operation

Enter 1 to Insert Ball 
Enter 2 to Delete Ball 
Enter 3 to Display 

Enter the choice : 2
Enter the serial no. to delete the ball : 2

Enter 4 to End Operation
Enter 1 to Insert Ball 
Enter 2 to Delete Ball 
Enter 3 to Display 

Enter the choice : 3
Sr.	Weight	colour
1.	2.5	blue
2.	5.0	blue
3.	2.5	red
4.	5.0	Greeen
Total Weight of Bag is : 12.5
No. of balls in bag are : 4
Enter 4 to End Operation

Enter 1 to Insert Ball 
Enter 2 to Delete Ball 
Enter 3 to Display 

Enter the choice : 4
Operation Ended*/