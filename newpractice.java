import java.util.Scanner;
import java.util.*;

class Aaa{
      int a,b;

}
class Bc{
    Aaa ok=new Aaa();
    public void  ma(){
        Scanner nn=new Scanner(System.in);
        System.out.println("Enter a value:");
        ok.a=nn.nextInt();
        System.out.println("Enter b value");
        ok.b=nn.nextInt();
        System.out.println("thehe value of a ="+ok.a);
        System.out.println("the vale of b is ="+ok.b);
    }
}
class Ccc{
    Aaa ol=new Aaa();
    public void hh(){
        int c=ol.a+ol.b;
        System.out.println(c);
    }
    public static void main(String []args){
        Bc kk=new Bc();
        kk.ma();
        Ccc l=new Ccc();
        l.hh();
    }
}
class bak{
   synchronized public void maee(int n){
        for(int i=1;i<5;i++){
            System.out.println(n*i);
        }try{
           Thread.sleep(4000);
       }catch(Exception f){
           System.out.println(f);
       }
    }
    public synchronized void sun(){
        System.out.println("the game is on");
    }
}
class vak{
    synchronized public void tun(int n){
        for(int i=1;i<5;i++){
            System.out.println(n*i);
        }try{
            Thread.sleep(2000);
       }catch(Exception f){
           System.out.println(f);
       }
    }
}
class ne{
    public static void main(String[] args)  {
        bak b=new bak();
        vak a=new vak();
//        void jun(){
//            this.start();
//            b.maee(a);
//        }
//        public void run(){
//            a.tun(5);
//        }
        Thread g=new Thread(){
            public void run(){
                b.maee(5);
            }
        };
        vak mm=new vak();
        Thread y=new Thread(){
            public void run(){
                mm.tun(6);
            }
        };
        y.start();
        g.start();
    }

}
class reverse_number{
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("enter a number:");
        int a =v.nextInt();
        int re=0;
        while(a>0){
            int b=a%10;
            a/=10;
            re=re*10+b;
        }
        System.out.println(re);
    }
}
class vh{
    public static void main(String []args){
        int a=123456;
        int b=100000;
           while(b>0){
               System.out.println(a/b);
               a%=b;
               b/=10;
           }
    }
}
class t22{
 int i=1;
    public synchronized void add(){
        while(i<=10) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number  ");
                    i++;
                    notify();
                }
                else {
                    try{
                        wait();
                    }catch (Exception e){
                        System.out.println(e);

                    }
                }
        }

    }
    public synchronized  void odd() {

        while ( i <= 10) {
            if (i % 2!= 0) {
                System.out.println(i + " is odd number  ");
                i++;
                notify();

            } else {
                try {
                    wait();
                } catch (Exception e) {

                }
            }
        }
    }
    public static void main(String []args){
        t22 nn=new t22();
        Thread t1=new Thread(){
            public void run(){
                nn.add();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                nn.odd();
            }

        };
        t1.start();
        t2.start();
    }
}

 class t23{
    public static void main(String[]aregs){
        String st="hooH",re="";
        for(int i=st.length()-1;i>=0;i--){
            re+=st.charAt(i);
        }
        if(st.equalsIgnoreCase(re)){
            System.out.println(st+" is a palindrome");
        }else{
            System.out.println(st+" is a not a palindrome");
        }
    }
 }

class Main {
    public static Set<String> getPermutation(String str) {

        // create a set to avoid duplicate permutation
        Set<String> permutations = new HashSet<String>();

        // check if string is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            // terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        // get the first character
        char first = str.charAt(0);

        // get the remaining substring
        String sub = str.substring(1);

        // make recursive call to getPermutation()
        Set<String> words = getPermutation(sub);

        // access each element from words
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {

        // create an object of scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter the string: ");
        String data = input.nextLine();
        System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
    }
}


