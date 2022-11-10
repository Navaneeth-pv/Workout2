import java.awt.*;

class SwapByValue {
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println("before swaping: \n Number 1-"+a+"\n Number 2-"+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swaping");
        System.out.println("Value of number 1:"+ a);
        System.out.println("Value of number 2:" +b);

    }
}
class swapByReference {
    public static void main(String []args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        System.out.println("x= " + p1.x + "y+ " + p1.y);
        change(p1);
        System.out.println("x= " + p1.x + "y= " + p1.y);
    }
    private static void change(Point p){
        p.x=2;
        p.y=1;

    }
}
