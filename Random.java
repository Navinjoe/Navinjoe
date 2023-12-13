import java.util.Scanner;

class asd {

    public static void add() {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c);
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public static int div(int a, int b) {
        int c = a / b;
        System.out.println(c);
        return c;
    }

    public static int asdd() {
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        add();
        sub(10, 6);
        div(10, 2);
        asdd();


    }
}
class Atm{
    public static void main(String []args) {
        while (true) {
            Scanner k = new Scanner(System.in);
            System.out.println("WELCOME TO UNIQ ATM ");
            System.out.println("Options");
            System.out.println("1.Account balance");
            System.out.println("2.widthdraw amount");
            System.out.println("3.Deposit amount");
            System.out.println("4.Exit");

            Atm n = new Atm();
            Scanner i = new Scanner(System.in);
            System.out.println("Enter your choice");
            int choice = i.nextInt();
            switch (choice) {
                case 1:
                    n.sample();
                    break;
                case 2:
                    n.withdraw();
                    break;
                case 3:
                    n.deposit();
                    break;
                case 4:
                    System.out.println("Thank you for using this Atm\n" +
                            "Visit again");
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.exit(0);
                    break;

            }
        }
    }

    public int sample() {
        System.out.println("your account balance is "+balance);
        return balance;
    }
    int withdraw(){
        Scanner i=new Scanner(System.in);
        System.out.println("Enter thed widthdraw amount:");
        int wa=i.nextInt();
        balance=balance-wa;
        System.out.println("your widhdraw amount is "+wa);
        System.out.println( "your account balance is "+ balance);
        return balance;

    }
    int deposit(){
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the deposit amount:");
        int Da=i.nextInt();
        balance=balance+Da;
        System.out.println("your deposit amount is "+Da);
        System.out.println( "your account balance is "+ balance);
        return balance;
    }
    int balance=10000 ;

}

class a{
    int x;
    int y;
}
class b{
    int n;
    int m;
    int z;

    public static void main(String[]args){
        a i=new a();
        i.x=45;
        i.y=25;

        b j=new b();
        j.n=i.x+i.y;

        b k=new b();
        k.m=i.x-i.y;

        System.out.println("int x,y add is = "+j.n);
        System.out.println("int x,y  sub is "+k.m);

        b r=new b();
        r.z=(j.n*k.m);
        System.out.println("product of n,m = " + r.z);
    }
}

  class cat {
    int   a =10;
    static void  maths() {
        System.out.println(" romeroo");
    }
}
class dogg extends cat {
    int  b=20;
    static  void  paths() {
        dogg nn=new dogg();
        int b1= nn.b+10;
        System.out.println("ghik " + b1);
    }

    public static void main(String[] args) {
        paths();

    }
}
class na{
    public void method(){
        System.out.println("welcome:");
    }
}class n extends na {
    public void method(){
        super.method();
        System.out.println("welcome to uniq:");
    }
    public void method1(){
        System.out.println("welcome to 6:");
    }
}
class upcasting{
    public static void main(String[] args) {
        na v= new n();
        n child = (n) v;
        child.method();
    }
}


