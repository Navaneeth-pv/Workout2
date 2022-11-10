import java.util.Scanner;

public class OneBHK {
    private double roomArea;
    private double hallArea;
    private double price;
    OneBHK()
    {
        roomArea=0;
        hallArea=0;
        price=0;
    }
    OneBHK(double roomArea, double hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
        System.out.println("Room Area: "+roomArea+"\nHall Area:"+hallArea+"\nPrice:"+price);
    }
}
class TwoBHK extends OneBHK{
    private double room2Area;
    TwoBHK(double roomArea, double hallArea,double price,double room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
    void show(){
        super.show();
        System.out.println("Room 2 Area: "+room2Area);
    }
}
class BHK{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TwoBHK obj1=new TwoBHK(10,10,1000,10);
        TwoBHK obj2=new TwoBHK(10,20,2000,10);
        TwoBHK obj3=new TwoBHK(10,15,2000,15);
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
