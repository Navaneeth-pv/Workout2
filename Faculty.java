import java.util.Scanner;

public class Faculty{
    int facultyid;
    float salary;
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowence;
    FullTimeFaculty(float basic,float allowence){
        this.basic=basic;
        this.allowence=allowence;
    }
    float salaryFulltime(){
        float salary1;
        salary1=(basic+allowence);
        return salary1;
    }
    void dispaly1(){
        System.out.println(salaryFulltime());
    }
}
class PartTimeFaculty extends Faculty{
    int hour;
    float rate;
    PartTimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;

    }
    float salaryParttime(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void display2(){
        System.out.println(salaryParttime());
    }
}
class DriverClass {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salry and allowance");
        FullTimeFaculty F=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        System.out.println("Enter parttime hour and hourly rate");
        PartTimeFaculty P=new PartTimeFaculty(sc.nextInt(), sc.nextFloat());
        F.dispaly1();
        P.display2();
    }
}


