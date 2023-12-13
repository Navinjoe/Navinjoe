
import java.util.Scanner;

class sbi{
    Scanner in =new Scanner(System.in);
    int a=0;
    void atm(){
        System.out.println("enter the count:");
        int count=in.nextInt();
        for(int i=0;i<=count;i++) {
            a++;
        }
        System.out.println("sbi atm:"+a+"times");
        java.util.Date date =new java.util.Date ();
        System.out.println(date);
    }
}class indian extends sbi{
    Scanner in =new Scanner(System.in);
    int a=0;
    void atm(){
        super.atm();
        System.out.println("enter the count:");
        int count=in.nextInt();
        for(int i=0;i<=count;i++) {
            a++;
        }
        System.out.println("indian atm:"+a+"times");
        java.util.Date day =new java.util.Date ();
        System.out.println(day);

    }

    public static void main(String[] args) {
      indian v=new indian();
      v.atm();
    }
}
interface show{
    void ma();
    void na();
    void ya();
    void ca();
}
abstract class jack implements show{
    public void ma(){
        System.out.println("hello");
    }

    public void ca() {
        System.out.println("welcome");
    }

}
class vj{
    int a=100;
    static String pass="romlsrg";
    public void ma(){
         a=300;
        int b= 200;
       int  c=a+b;
        System.out.println(c);
    }
    public String ca(){
        String name ="local";
        String names=name+pass;
        System.out.println(names);
        return names;
    }
    public int va(int a,int b){
        pass="romlrg";
        int d=a*b;
        System.out.println(d);
        System.out.println(pass);
        return d;
    }
    public void na(int b){
        int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        vj nw=new vj();
        nw.ma();
        nw.ca();
        nw.va(10,40);
        nw.na(70);
        System.out.println( "the value of a is "+ nw.a);
    }
}






