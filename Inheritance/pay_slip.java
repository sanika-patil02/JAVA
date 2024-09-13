import java.util.*;

public class pay_slip {
    public static void main(String [] args){
        int ch;
        Scanner sc=new Scanner(System.in);

    System.out.println("Which Type of Professor You are:\n1.Assistant Professor\n2.Assocoate Professor\n3.Proffesor");
    ch=sc.nextInt();

    switch(ch){
        case 1:
           Assistant_prof a=new Assistant_prof();
           a.getdata();
           a.input();
           a.display();
           a.output();
           a.calculate();
           break;


        case 2:
        Associate b=new  Associate();
        b.getdata();
        b.input();
        b.display();
        b.output();
        b.calculate();
        break;

        case 3:
        Professor c=new  Professor();
        c.getdata();
        c.input();
        c.display();
        c.output();
        c.calculate();

    }
    }
    
}
