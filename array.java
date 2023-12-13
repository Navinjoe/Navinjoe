import java.util.Arrays;
import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        int marks[] = {100, 900, 80};
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
        String name[] = {"navin", "developer", "blogger"};
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(name[i]);
        }
        System.out.println();
    }
        int a[] = {20, 30, 40};
        int b[] = {50, 60, 70};

        int[] c = new int[6];
        for (int i = 0; i < 3; i++) {

            c[i] = a[i];
        }
        int j = 0;                         //Array  concatenation;
        for (int i = 3; i < 6; i++) {
            c[i] = b[j];
            j++;
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < 3; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
        for (int i = 0; i < 3; i++) {
            c[i] = a[i] * b[i];
            System.out.println(c[i]);
        }
        int nav[][] = new int[5][20];
        nav[4][5] = 67;
        nav[3][6] = 89;
        nav[4][19] = 89;
        System.out.println("nav[3][6] is " + nav[3][6]);
        System.out.println("nav[4][5] is " + nav[4][5]);
        System.out.println("nav[4][5] is " + nav[4][19]);

    }
}
class multiple_with_extra_variables{
    public static void main(String[]args){
        int y[]={56,7,8,99,7,55,7};
        int x[]={5,6,7,8,9};
        int len1=x.length;
        int len2=y.length;
        int small= len1<len2 ? len1:len2;
        int big= len1>len2 ? len1:len2;
        int z[]= new int[big];
        for(int i=0;i<small;i++){
            z[i]=x[i]*y[i];                   //Array multiples with extra variables;
        }
        if(x.length>y.length){
            for(int i=small;i<z.length;i++){
                z[i]=x[i];
            }
        }
        else if(y.length>x.length) {
            for(int i=small;i<z.length;i++){
                z[i]=y[i];
            }
        }
        System.out.println(Arrays.toString(z));
    }
}
class addeparr {                                         //insert a new elements
    public static int[] addarray(int n,int a[],int pos ,int x){
       int na[]= new int[n+1];
       for(int i=0;i<n+1;i++){
           if(i<pos-1){
               na[i]=a[i];
           }
           else if(i==pos-1){
               na[i]=x;
           }
           else{
               na[i]=a[i-1];
           }
       }
       return na;
    }
    public static void main(String[] args) {
        int a[]={11,22,33,44,55,66,77,88,99,10};
        System.out.println("before adding elemts\n"+Arrays.toString(a));
         a=addarray(10,a,7,500);
        System.out.println("after adding the elements");
        System.out.println(Arrays.toString(a));
    }
}
class deAIP{
    public static void main(String[] args) {
        int []r={2,5,6,7,8,9,10};
        int []s=new int[r.length-1];
        int j=5;
        int k=0;
        for(int i=0;i<r.length;i++){
            if(i!=j){
                s[k]=r[i];
                k++;
            }
        }
        System.out.println("before "+Arrays.toString(r));
        System.out.println("after"+ Arrays.toString(s));
    }
}
class insert_at_particular_position{
    public static void main(String[] args) {
        int[]a={10,20,30,40,50,60,70,80,90,100};
        System.out.println( "Before "+Arrays.toString(a));
        int element=508;
        int pos=3;
        for(int i=a.length-1;i>pos;i--){
            a[i]=a[i-1];
        }
        a[pos]=element;
        System.out.println("After Array"+Arrays.toString(a));
    }
}

class reversed_array{                                  //Reverse Array
    public static void main(String[] args) {
        System.out.println("before reversing");
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("After reverse:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
}


class basica{
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the number Want");
            a[i]=in.nextInt();
        }
        for(int j:a){
            System.out.println( " The user Number is "+ j);
        }
    }

}
class ascending_order{
    public static void main(String[] args) {
        int []c={10,7,6,11,2,3,4,1};
        int temp;
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(c));
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                   temp=c[i];
                   c[i]=c[j];
                   c[j]=temp;
                }
            }
        }
        System.out.println("After sort:");
        System.out.println(Arrays.toString(c));
    }
}
 class removeduplicates_and_print{
     public static void main(String[] args){
         int b[]={2,5,5,6,6,7,8,9,2};
         System.out.println("Before removing");
         for (int i=0;i<b.length;i++){
             System.out.print(b[i]+" ");
         }
         System.out.println("\nThe duplicate Elements are:");
         for (int i =0;i<b.length;i++){
             for(int j =i+1;j<b.length;j++){
                 if(b[i]==b[j]&& i!=j){
                     System.out.print(b[i]+" ");
                 }
             }
         }
         for(int i=0;i<b.length;i++){
             for(int j=i+1;j<b.length;j++){
                 if(b[i]==b[j]){
                     b[i]=-1;
                 }
             }
         }
         System.out.println("\nAfter removing the dup:");
         for(int i=0;i<b.length;i++){
             if(b[i]!=-1){
                 System.out.print(b[i]+" ");
             }
         }
     }
}
class addorevena{
    public static void main(String[] args) {
        int even=0; int odd=0;
        int[]a=new int[7];

        for(int i=0;i<7;i++){
            Scanner v=new Scanner(System.in);
            System.out.println("The value of  a["+i+"] is");
            a[i]=v.nextInt();
        }
        for(int j:a){
            System.out.print(j+" ");
            if(j%2==0){
                even ++;
            }else {
                odd++;
            }
        }
        System.out.println();
        System.out.println( "the even numbers are:" + even);
        System.out.println( "the odd numbers are:" + odd);
    }
}
class find_largesttt_number{
    public static int maxim(int a [],int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return(a[n-1]);
    }
    public static void main(String []args){
        int a[]={45,61,78,90,29,100};
        System.out.println(maxim(a,a.length));
    }
}



