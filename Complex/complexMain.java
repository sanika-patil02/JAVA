import java.util.*;

public class complexMain {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Float real, img;
        System.out.println("Enter the real value for C1");
        real = sc.nextFloat();
        System.out.println("Enter the img value for C1");
        img = sc.nextFloat();
        complex c1 = new complex(real, img);
        System.out.println("Enter the real value for C2");
        real = sc.nextFloat();
        System.out.println("Enter the img value for C2");
        img = sc.nextFloat();
        complex c2 = new complex(real, img);
        complex C3 = new complex();

        do {
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
            System.out.println("Enter your choice");

            int ch;
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    C3.Add(c1, c2);
                    System.out.println("Addition is equal to:");
                    C3.display();
                    break;

                case 2:
                    C3.Substract(c1, c2);
                    System.out.println("Substraction is equal to:");
                    C3.display();
                    break;

                case 3:
                    C3.multiply(c1, c2);
                    System.out.println("Multiplication is equal to:");
                    C3.display();
                    break;

                case 4:
                    C3.divide(c1, c2);
                    System.out.println("Division is equal to:");
                    C3.display();

            }
            System.out.println("Do you want to continue\n1.Yes\n2.No");
            n = sc.nextInt();
        } while (n == 1);

    }
}