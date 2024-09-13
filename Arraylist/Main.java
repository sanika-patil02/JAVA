import java.util.*;
// import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Arraylist a=new Arraylist();
        int op,ch;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Select from folllowing:\n1.Add element in arraylist:\n2.remove\n3.Display\n4.Check Even\n5.Check odd\n6.Check prime");
            System.out.println("7.palindrome strings from entered string");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    a.input();
                    break;
                case 2:
                     a.remove();
                     break;
                case 3:     
                    a.display();
                    break;
                case 4:
                    System.out.println("\nEven elements in arraylist are:\n");
                    a.even();
                    break;
                case 5:
                    System.out.println("\nOdd elements in arraylist are:\n");
                    a.odd();
                    break;
                case 6:
                    a.prime();
                    break;
                case 7:
                    a.palindrome();
        
            }
            System.out.println("\nDo you want to continue:\n1.YES\n2.NO");
            op=sc.nextInt();
        }while(op==1);
    }
    
}




/**********OUTPUT***********
Select from folllowing:    
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
1
Enter Number of elements:
5
Enter elements:
11
14
12
99
17

Do you want to continue:
1.YES
2.NO
1
Select from folllowing:
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
2
Enter element to be removed:
99

Do you want to continue:
1.YES
2.NO
1
Select from folllowing:
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
3
Elements are:
11      14      12      17
Do you want to continue:
1.YES
2.NO
1
Select from folllowing:
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
4

Even elements in arraylist are:

[14, 12]

Their are  2 even elements in Array list

Do you want to continue:
1.YES
2.NO
1
Select from folllowing:
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
5

Odd elements in arraylist are:

[11, 17]

Their are  2 odd elements in Array list

Do you want to continue:
1.YES
2.NO
1
Select from folllowing:
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
6

Their are  2 Prime elements in Array list
Prime numbers in list are
[11, 17]

Do you want to continue:
1.YES
2.NO
1
Select from folllowing:
1.Add element in arraylist:
2.remove
3.Display
4.Check Even
5.Check odd
6.Check prime
7.palindrome strings from entered string
7
How many strings you want to check 
2
Enter Strings:
naman
ram
Palindrome Strings is/are:
[naman]

Do you want to continue:
1.YES
2.NO
2*/
