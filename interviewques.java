
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class swap {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("a" + "=" + a);
            System.out.println("b" + "=" + b);
            System.out.println();
        }
    }
    class xa {
        public static void main(String[] args) {
            int a=1000;
            int b=2000;

            System.out.println("using third variable ");
            int x=a;
            a=b;
            b=x;

            System.out.println("a" + "=" +a);
            System.out.println("b" + "=" +b);
        }
    }
    class reversee_number{
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
class palimndrome {
    public static void main(String[]aregs){
        String st="Hannah",re="";
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
class fibonacci{
    public static void main(String []args){
        int num1=0,num2=1;
        int nextnum;
        int ls=100;
        for(int i=0;i<ls;i++){
            System.out.print(num1+" ");
            nextnum=num1+num2;
            num1=num2;
            num2=nextnum;
        }
    }
}
class Armstrongnumber{
    public static void main(String[]args){
        Scanner vs=new Scanner(System.in);
        System.out.println("enter the number");
        int a=vs.nextInt();
        int Arms=a;
        int temp;
        int n=0;
        while(a>0){
            temp=a%10;
            n=n+(temp*temp*temp);
            a=a/10;
        }
        if(Arms==n){
            System.out.println("is a Armstrong number");
        }
        else{
            System.out.println("is not a Armstrong number");
        }
    }
}
class prime_or{
    public static void main(String[]args){
        int s;
        System.out.println("The prime numbers are");
        for(int i=2;i<100;i++){
            s=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    s=1;
                    break;
                }
            }
            if(s==0){
                System.out.print(i+" ");
            }
        }
    }
}

class oddorreven{
    public static void main(String[]args){
        System.out.println("The even numbers are  ");
        for(int i=1;i<100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+"the odd numbers ");
        for(int i=1;i<100;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}
 class ThirdLargestInArrayExample{
    public static int getThirdLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-3];
    }
   public static   int getsmallest(int[] c, int n) {
       int tempp;
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               if (c[i] > c[j]) {
                   tempp = c[i];
                   c[i] = c[j];
                   c[j] = tempp;
               }
           }
       }
       return c[n - 3];
   }
    public static void main(String args[]){
        int a[]={1,2,5,6,3};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Third smallest: "+getThirdLargest(a,a.length));
        System.out.println("Third smallest: "+getsmallest(a,b.length));

    }
}
class given_AStringIP{
    public static void main(String[]argd){
        Scanner vv=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=vv.next();
        mat(str);
    }
    public static String mat(String sv){
      String c =new StringBuilder(sv).reverse().toString();
      String a=sv+c;
      System.out.println(" Ther palindrome of the given String"+"\n"+a);
      return a;
    }
}
class permutations{
    public static Set<String> permutation(String st){
        Set<String>per=new HashSet<>();
        if(st.length()==0){
            per.add("");
            return per;
        }
        char fi=st.charAt(0);
        String su=st.substring(1);
        Set<String>word= permutation(su);

       for(String game :word){
           for(int i=0;i<=game.length();i++){
               per.add(game.substring(0, i)+ fi + game.substring(i)); //permutation
           }
       }
       return per;
    }
    public static void main(String[] args) {
        Scanner vdc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String data = vdc.nextLine();
        System.out.println("Permutations of " + data + "\n" + permutation(data));
    }
}



