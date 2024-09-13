import java.util.Scanner;


public class PrimePair {
public static void main(String [] args){
int range;
Scanner obj= new Scanner(System.in);
System.out.println("Enter Range: ");
range=obj.nextInt();
if( range>1){
System.out.println("2,3");
for (int i=1;i<=range;i++)
{
if((i+2) < range){
if(isPrime(i) && isPrime(i+2)){
System.out.println(i+","+(i+2)+"   ");

}
}
}
}


}
public static boolean isPrime(int num){
int flag=-1;

if(num == 1)
   {
    flag = 0;
   }
   else
   {
       if(num%2 == 0)
       {
        if(num == 2)
        {
        flag=1;
        }
        else
        {
        flag = 0;
        }
       }
       else
       {
        int n=(int)Math.ceil(Math.sqrt(num));
        for(int j = 2 ;j<=n; j++)
        {
        if(num % j == 0)
        {
        flag=0;
        break;
        }
        else
        {
        flag=1;
        }
        }
       }
   }
if(flag==1)
{
return true;
}
else
{
return false;
}

}

}
