import java.util.Scanner;
public class input{
    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String coder=sc.next();
        for(int i=1;i<=10;i++)
            System.out.println("Hello hi  "+  coder);


    }
}
//using type conversion
class student{

    public static void main(String[] args){
        student s1=new student();
//        System.out.println(s1.name);
        long nav=5;
        int i=(int)nav;

        System.out.println(i);

    }
}
//#using operators
class operator{
    public static void main (String [] args){
        int a=10,b=-10;
        System.out.println(~a);
        System.out.println(~b);
//  unary operator
    }
}
//shift operators
class Operator {
    public static void main(String args[]) {
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); //output : 21
        System.out.println(10<<2);
        System.out.println(10<<4);
        System.out.println(20>>3);
    }
}
//using logical AND operator

class  operatorL{
    public static void main (String []args){
        int a=25,b=25,c=35;
        System.out.println(" the value of b is " + b);
        if((a>b) && (++c>b)) {
            System.out.println(" the value of b" + b);
        }
        else
            System.out.println("this logical operator works only on True" +a);
    }

}
class  operatorLO{
    public static void main (String []args){
        int a=25,b=25,c=35;
        System.out.println(" the value of b is " + b);
        if((a>b) || (++c>b)) {
            System.out.println(" the value of b is " + b);
        }
        else
            System.out.println("this logical or operator works only on 1 True" +a);
    }
}
class operatorLN {
    public static void main(String[] args) {
        int a = 20, b = 25, c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(10+10*6/2);

        System.out.println("logical not  operator works reverse" +(!(a<b)));
        }
    }
//   bitwise operator
 class bitwiseoperatorA{
    public  static void main(String []args){
        int a=9,b=10,c;
        c=(a&b);
        System.out.println("x&y=" + c);
    }

}
class bitwiseoperator{
    public static void main(String []args){
        short a=7 ,b=6;
        long c=(a|b);
        System.out.println("a|b="+c);
    }
}
class controls{
    public static void main(String[]args){
        int jungle=5;
        String aniaml;
        switch (jungle)
        {
            case 1:
                aniaml="lion";
                break;
            case 2:
                aniaml="tigre";
                break;
            case 3:
                aniaml="cheetah";
                break;
            case 4:
                aniaml="elephant";
                break;
            case 5:
                aniaml="bears";
                break;
            case 7:
                aniaml="giraffe";
                break;
            default :
                aniaml="wolfs";


        }System.out.println("now the most dangerous aniaml is  " +aniaml+ "  in the jungle");
    }
}
