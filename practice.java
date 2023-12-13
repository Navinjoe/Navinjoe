import java.util.Arrays;
import java.util.Scanner;


class practice{
    public static void main(String[] args) {
        int a[]={10,20,30};
        int b []={40,50,60,70};
        int len=a.length+b.length;
        int c[]=new int [len];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        int j=0;
        for(int i=3;i<7;i++){
            c[i]=b[j];
            j++;
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("adding two elements:");
        int len1=a.length;
        int len2=b.length;
        int small=len1<len2 ? len1:len2;
        int big=len1>len2 ? len1:len2;
        int d[]=new int[big];
        for(int i=0;i<small;i++)
        {
            d[i]=a[i]+b[i];
        }
        if(a.length>b.length){
            for(int i=small;i<d.length;i++){
                d[i]=a[i];
            }
        }
        else if(b.length>a.length){
            for(int i=small;i<d.length;i++){
                d[i]=b[i];
            }
        }
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        System.out.println();
        System.out.println("multiplying two elements");
        for(int i=0;i<3;i++){
            c[i]=a[i]*b[i];
            System.out.println(c[i]+" ");
        }
    }
}

class haff{
    public static void main(String[] args) {
        for(int i=3;i<=10;i+=(i == 3 ? 2 : 5))
            System.out.print(i+" ");
        System.out.println();

        }
}
// Java Program to print pattern
// Square hollow pattern

 class GeeksForGeeks {
    // Function to demonstrate pattern

    // Driver Function
    public static void main(String args[])
    {
        int n =20;
        int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n; i++)
        {
            // inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // star will print only when it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n - 1
                        || j == n - 1)
                {
                    System.out.print("N");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class prt{
    int ist=1;
    public int  hav(){
        System.out.println(ist);
        return ist= ist+1;
    }
    public int ha(){
        System.out.print(ist);
        return ist=ist+1;
    }


    public static void main(String[] args) {
        prt n=new prt();
        n.hav();
        n.hav();
        n.ha();
        n.ha();
        n.ha();
        n.ha();
    }
}
class pt{
    int a=1;
    public static void main(String[] args) {
        pt v=new pt();System.out.println(v.a);
        pt c=new pt();c.a=v.a+1;System.out.println(c.a);
        pt d=new pt();d.a=c.a+1;System.out.print(d.a);
        pt e=new pt();e.a=d.a+1;System.out.print(e.a);
        pt f=new pt();f.a=e.a+1;System.out.print(f.a);
        pt g=new pt();g.a=f.a+1;System.out.print(g.a);
    }
}
class insert{
    static int[] insertx( int pos, int[] a, int x){
        int nu[]=new int [a.length+1];
        for(int i=0;i<nu.length;i++){
            if(i<pos-1){
                nu[i]=a[i];
            }
            else if(i==pos-1){
                nu[i]=x;
            }
            else {
                nu[i]=a[i-1];
            }
        }
        return nu;
    }

    public static void main(String[] args) {
        int a[]={1,2,34,55,66,7,88,99,100};
        System.out.println("Before"+ Arrays.toString(a));
        a=insertx(5,a,700);
        System.out.println("after"+Arrays.toString(a));
    }
}


    class Afternoon{
        public static void main(String[] args) {
            while (true) {
                try {
                    Scanner nn = new Scanner(System.in);
                    System.out.println("enter the id");
                    int id = nn.nextInt();
                    System.out.println("enter the name");
                    String n = nn.next();
                    System.out.println("enetr the phonenumber");
                    long phno = nn.nextLong();
                    System.out.println(" your match  found");
                    break;
                }
                catch (Exception e){
                    System.err.println(e);
                }

                }
            }
        }
        class A{
           int a;
           int b;
        }
        class B{
    A ok=new A();
    public void  ma(){
        Scanner nn=new Scanner(System.in);
        System.out.println("Enter a value:");
        ok.a=nn.nextInt();
        System.out.println("Enter b value");
        ok.b=nn.nextInt();
        System.out.println("thehe value of a =");
        System.out.println("the vale of b is =");
    }
}
class C{
    A ol=new A();
     public void hh(){
        int c=ol.a+ol.b;
        System.out.println("c");
    }
    public static void main(String []args){
         B kk=new B();
        kk.ma();
        C l=new C();
        l.hh();
    }
}
class neww {
    public static void main(String[] args) {
        for (int i = 3; i > 0; i--) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(i );
            }
            System.out.println();
        }
    }
}
  abstract class t21{
     abstract void run();
 }
 class best extends t21{
    public void run(){
        System.out.println("welcome back");
    }
 }
 class vest extends t21{
    public void run(){
        System.out.println("come guys");
    }
    public static void main(String []args){
        vest jj=new vest();
        best kk=new best();
        t21[] m=new t21[4];
        m[0]=new best();
        m[1]=new best();
        m[2]=new vest();
        m[3]=new vest();
        for(t21 m1:m){
            m1.run();
        }
    }
 }
 class gh{
    int t1=2,t2=3,t3=4,t4=5,t5=6;
    public int total(){
        int total=t1+t2+t3+t4+t5;
        System.out.println( "the sum is "+total);
        return total;
    }
 }
 class h{
    public int  avg( int a) {
        int  avg=a/5;
        System.out.println("average is "+avg);
        return avg;
    }

     public static void main(String[] args) {
         gh nn=new gh();
         h kk=new h();
         kk.avg(nn.total());
     }
 }









