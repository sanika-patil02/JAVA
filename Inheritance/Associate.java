import java.util.*;

public class Associate extends person{
    private double basic_pay;
    private String DN;  //department name
    private double academic_grade_pay;
   

    Scanner sc=new Scanner(System.in);

    public void input(){
      System.out.println("Department Name:");
      DN=sc.next();

      System.out.println("Basic pay:");
      basic_pay=sc.nextDouble();

      System.out.println("Academic Grade Pay:");
      academic_grade_pay=sc.nextDouble();

    }

    public void calculate(){
         double da=((119.0*(basic_pay+academic_grade_pay))/100.0);
         double hra=(30.0*(basic_pay+academic_grade_pay))/100.0;
        double pf=(12.0*(basic_pay+academic_grade_pay))/100.0;
        double club_fund=(0.1*(basic_pay+academic_grade_pay))/100.0;
        double gross_salary=basic_pay+academic_grade_pay+da+hra;
        double net_salary=gross_salary-pf-club_fund;
         System.out.println("Your Gross Salary is:"+gross_salary);
         System.out.println("Your Net Salary is:"+net_salary);

    }

    public void output(){
        
        System.out.println("Your Department Name is:"+DN);
    }
}
