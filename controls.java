import java.util.Scanner;
class calculator{
    public static void main (String[]args){
        int a,b;
        Scanner nav=new Scanner(System.in);
        System.out.println("Enter  a first  number:");
        a= nav.nextInt();
        System.out.println("Enter a second number:");
        b= nav.nextInt();
        System.out.println("Enter the operator +,-,*,/,%:");
        char calculator=nav.next().charAt(0);

        switch (calculator){
            case '+':
                System.out.println(a+"+"+b+"="+ (a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+ (a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+ (a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+ (a/b));
                break;
            case'%':
                System.out.println(a+"%"+b+"=" + (a%b));
                break;
            default:
                System.out.println("invalid error");
        }

    }
}

class loops{
    public static void main(String [] args)
    {
        int i=5;
        String s1="navin\n";
        System.out.println("welcome to loops:");
        while(i<=100){
            System.out.println(i);
            i+=5;
        }
//without loops

        String s2=s1+s1;
        String s5=s2+s2+s1;
        String s10=s5+s5;
        String s30=s10+s10+s10;
        String s100=s30+s30+s30+s10;
        String s1000=s100+s100+s100+s100+s100+s100+s100+s100+s100+s100;
        System.out.println(s1000);
    }
}
//for loop
