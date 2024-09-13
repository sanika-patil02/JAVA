import java.util.*;

public class Arraylist{
    int n,k;
    ArrayList<Integer>list=new ArrayList<Integer>();
    ArrayList<Integer>list_odd=new ArrayList<Integer>();
    ArrayList<Integer>list_even=new ArrayList<Integer>();
    ArrayList<Integer>list_prime=new ArrayList<Integer>();
    ArrayList<String>list_palindrome=new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    
    public void input(){
        System.out.println("Enter Number of elements:");
        n=sc.nextInt();
        System.out.println("Enter elements:");

    for(int i =0;i<n ;i++){
        
        k=sc.nextInt();
        list.add(k);
    }
    }

   public  void remove(){
        System.out.println("Enter element to be removed:");
        int key=sc.nextInt();
        int k=list.indexOf(key);
        list.remove(k);
    }

    public void display(){
        System.out.println("Elements are:");

        for(int i=0;i<list.size();i++){
           System.out.print(list.get(i)+"\t");
        }
    }

    public void even(){
        int count=0;
        
        for(int i=0;i<list.size();i++){
            
            if(list.get(i)%2==0){
                list_even.add(list.get(i));
                  
                  count++;
            }
            
        }
        System.out.println(list_even);
        System.out.println("\nTheir are  "+count+" even elements in Array list");
        
    }

    public void odd(){
        int count=0;
        
        for(int i=0;i<list.size();i++){
            
            if(list.get(i)%2!=0){
                  list_odd.add(list.get(i));
                  count++;
            }
           
        }
        System.out.println(list_odd);
        System.out.println("\nTheir are  "+count+" odd elements in Array list");
    }

    public void prime(){
        
        int count=0;
        

        for(int i=0;i<list.size();i++){
            
                if(list.get(i)%2==0){
                    if(list.get(i)==2){
                        list_prime.add(list.get(i));
                        count++;
                        break;
                    }
                }
                else{
                    //  int n=(int)Math.ceil(Math.sqrt(list.get(i)));
                    for(int j=2;j<list.get(i);j++){
                        if(list.get(i)%j==0){
                            break;
                        }
                        else{
                            list_prime.add(list.get(i));
                            count++;
                            break;

                        }
                    }
                }
            }
            System.out.println("\nTheir are  "+count+" Prime elements in Array list");
        System.out.println("Prime numbers in list are");
        System.out.println(list_prime);
}
        
    

    public void palindrome(){
        
    String str;
    int n;

    System.out.println("How many strings you want to check ");
    n=sc.nextInt();
    System.out.println("Enter Strings:");
    for(int i=0;i<n;i++){

    str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            list_palindrome.add(str);
        }

    }
    System.out.println("Palindrome Strings is/are:");
    System.out.println(list_palindrome);
           
        }
       
    }
