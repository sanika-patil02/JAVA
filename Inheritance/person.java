import java.util.*;

class person{
    private String name;
    private int DOB;
    private String PAN;
    private int adhar;
    private String address;
    private int age;
    private int mobile_no;
    private String email_id;
    private String employee_id;
    private int month;
    private int date;
    private int year;
    
    Scanner sc=new Scanner(System.in);
    /**
     * 
     */
    public void getdata(){
        System.out.println("******Enter following Details*********");
        System.out.println("Name:");
        name=sc.next();
        
        do{
        System.out.println("age:");
        age=sc.nextInt();
        }while(age>150 && age<=0);
        
        do{
        System.out.println("DOB:");
        System.out.print("Date:");
        date=sc.nextInt();
        System.out.print("month:");
        month=sc.nextInt();
        System.out.print("year:");
        year=sc.nextInt();
        }while(date>31 || date<0 || month<0 || month>12 || year<1700 || year>2022);

        System.out.println("Address:");
        address=sc.next();
        
        do{
        System.out.println("PAN:");
        PAN=sc.next();
        }while(PAN.length()<10 || PAN.length()<0);
        
        // do{
        System.out.println("Adhar Number:");
        adhar=sc.nextInt();
        // }while(adhar < 1000000000 || adhar >1000000000);
    

        System.out.println("Mobile Number:");
        mobile_no=sc.nextInt();

        System.out.println("Email id:");
        email_id=sc.next();
        
        System.out.println("Employee id:");
        employee_id=sc.next();
        
}

public void display(){
    System.out.println(" ****Your Information****");
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("DOB:"+date+"/"+month+"/"+year);
    System.out.println("PAN:"+PAN);
    System.out.println("Address:"+address);
    System.out.println("Adhar Number:"+adhar);
    System.out.println("Mobile Number:"+mobile_no);
    System.out.println("Email id:"+email_id);
    System.out.println("Employee id:"+employee_id);
}

}
