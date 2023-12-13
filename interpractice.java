import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class prime {
    public static void main(String[]artg){
        int s;
        System.out.println("The prime numbers are ");
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
class facct{
    public static void main(String []args){
       Scanner bb=new Scanner(System.in);
        System.out.println("Enter the number");
       int num =bb.nextInt();
       int fact=1;
       for(int i = 1; i<= num; i++){
           fact=fact*i;
       }
        System.out.println("the factorial number is "+fact);
    }
}
class ABCD{
    public static Set<String> max(String sy) {
        Set<String> per = new HashSet<>();
        if (sy.length() == 0) {
            per.add("");
            return per;
        }

        char gi = sy.charAt(0);
        String v=sy.substring(1);
        Set<String>work=max(v);

        for(String home:work ){
            for(int i=0;i<=home.length();i++){
                per.add(home.substring(0, i)+ gi +home.substring(i));
            }
        }
        return per;
    }

    public static void main(String[] args) {
        Scanner mm=new Scanner(System.in);
        System.out.println("Enter the String");
        String vv=mm.next();
        System.out.println("Permutations of " + vv + "\n"+max(vv));
    }

}