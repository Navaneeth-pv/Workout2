import javax.xml.transform.Result;

public class Emplyee {
    String Name;
    String EmpID;

    float Assessment1;
    float Assessment2;
    float Assessment3;
    float totalMark;
    float totalPercentage;
    String Result= "";

    public Emplyee(String name, String empID,float as1,float as2,float as3)
    {
        this.Name=name;
        this.EmpID=empID;
        this.Assessment1=as1;
        this.Assessment2=as2;
        this.Assessment3=as3;
    }
    public void calResult(){
        totalMark = this.Assessment1+this.Assessment2+this.Assessment3;
        totalPercentage= totalMark/3;

        if (this.Assessment1>75 && this.Assessment2>75 && this.Assessment3>75)
        {
            Result = "Promoted";
        }
        else
        {
            Result = "Demoted";
        }
    }
    public void displayResult()
    {
        System.out.println("Total mark : "+totalMark);
        System.out.println("Total percentage: "+totalPercentage);
        System.out.println("Result is: "+Result);
    }
    public static void main(String[]args){
        Emplyee A1= new Emplyee("Messi","1",90,95,78);
        A1.calResult();
        A1.displayResult();
    }
}
