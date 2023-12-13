import java.lang.annotation.Native;
import java.util.Arrays;
import java.util.Scanner;
class countfrequency {
    public static void main(String[]args){
        Scanner hh=new Scanner(System.in);
        System.out.println("enter the String ");
        String nn=hh.next();
        int a[]=new int[255];
        for(int i=0;i<nn.length();i++){
            a[(int)nn.charAt(i)]++;
        }
        for(int i=0;i<255;i++){
            if(a[i]!=0){
                System.out.println((char)i+"=="+a[i]);
            }
        }
    }
}

// Java program to remove duplicate character
// from character array and print in sorted
// order
class rdp{
    public static void main(String[] args) {
        StringBuffer nn = new StringBuffer("ramanathapuram");
        int length = nn.length();
        System.out.println("\nThe duplicate Elements are:");

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                char d=nn.charAt(i);
                char f=nn.charAt(j);
                if(d==f){
                    nn.deleteCharAt(i);
                    i=0;j=0;
                    length=length-1;
                }
            }
        }
        System.out.println(nn+" ");
    }
}
class PD{
    public static void main(String[]args){
        Scanner jj=new Scanner(System.in);
        System.out.println("Enter the String");
        String vv=jj.next();
        char []a=vv.toCharArray();
        int ca;
        for(int i=0;i<a.length;i++){
            ca=1;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] == a[j] && a[i] != ' ') {
                    ca++;
                    a[j] = 0;        //avid printing visited characters
            }                             //use separate if
            }

                if(ca>1 && a[i]!=0){
                    System.out.println("\n"+a[i]+" ");
                }
            }
        }
    }

class amrs{
    public static void main(String[] args) {
        String a="vagaV";
        String va="";
        for(int i=a.length()-1;i>=0;i--){
            va=va+a.charAt(i);
        }
        if(a.equalsIgnoreCase(va)){
            System.out.println("it is armstrong");
        }
        else{
            System.out.println("not ");
        }
    }
}
class reverseString{
    public static void main(String[] args) {
        String nsa="chenai wheather is too hot";
        String ne= "";
        for(int i=nsa.length()-1;i>=0;i--){
            ne=ne + nsa.charAt(i);
        }
        System.out.println("before reverse ");
        System.out.println(nsa);
        System.out.println("After revverse:");
        System.out.println(ne);
    }
}

class vjk{
    public static void main(String[] args) {
        Scanner jj=new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuffer nn=new StringBuffer("");
        nn.append(jj.next());
        int l=nn.length();
        for(int i=0;i<nn.length();i++){
            for(int j=i+1;j<nn.length();j++){
                int b=nn.charAt(i);
                int ba=nn.charAt(j);
                if(b==ba){
                    nn.deleteCharAt(i);
                    i=0;j=0;
                    l=l-1;
                }
            }
        }
        System.out.println("After removing duplicates");
        System.out.println(nn+" ");
    }
}

