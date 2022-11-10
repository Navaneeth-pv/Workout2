import java.util.Scanner;

public class MathFunction {

    public static void main (String[] args){
        int a,b,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        a = sc.nextInt();
        System.out.println("Enter second integer:");
        b = sc.nextInt();
        p = a*b;
        System.out.println("Product of two Integer: " +p);

        double c,d,product;
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter first float");
        c=sc1.nextDouble();
        System.out.println("Enter second float");
        d=sc1.nextDouble();
        product=c*d;
        System.out.println("Product of two float: "+product);

        int e;
        double f,g;
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter first number");
        e=sc2.nextInt();
        System.out.println("Enter float:");
        f=sc2.nextDouble();
        g= e*f;
        System.out.println("Product: "+g);
    }
}

