import java.util.Arrays;
import java.util.Scanner;

class Arraypractice {
   public static int[] insertE(int n, int a[],int x, int pos) {
       int[] na = new int[n + 1];
       for (int i = 0; i < n+1; i++) {
           if (i < pos- 1) {
               na[i] = a[i];
           } else if (i== pos - 1) {
               na[i] = x;
           } else {
               na[i] = a[i - 1];
           }
       }
       return na;
   }

    public static void main(String[] args) {
        int[] a = {22, 45, 6, 7, 8, 99, 35, 55};
        System.out.println("before inserting "+"\n"+Arrays.toString(a));
        a=insertE(a.length,a,500,5);
        System.out.println("after inserting"+"\n"+Arrays.toString(a));

    }
}
class dfkgn{
    public static void main(String[] args) {
        int r[]={12,34,56,7,8,9};
        int s[]=new int[r.length-1];
        int j=3;
        int k=0;
        for(int i=0;i<r.length;i++){
            if(i!=j){
                s[k]=r[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(s));
    }
}
     class reverse {
         public static void main(String[] args) {
             int a[] = {10, 20, 30, 40, 50};
             System.out.println("Before");
             for (int i = 0; i < a.length; i++) {
                 System.out.print(a[i]+" ");
             }
             System.out.println();
             System.out.println("After");
                 for (int i = a.length - 1; i >= 0; i--) {
                     System.out.print(a[i]+" ");
                 }
             }
         }
class oddoreven{
    public static void main(String[] args) {
        int b[]= new int[10];
        int even=0;int odd=0;
        for(int i=0;i<10;i++){
            Scanner v=new Scanner(System.in);
            System.out.println("Enter the value of ["+i+"]");
            b[i]=v.nextInt();
            }
        for(int j:b){
            if(j%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println();
        System.out.println("The total number of even is"+ even);
        System.out.println("The total number of odd is:"+odd);
        }
    }
class ascendingorder{
    public static void main(String[] args) {
        int temp;
        int []y={12,569,567,321,789,234};
        System.out.println("before sort");
        System.out.println(Arrays.toString(y));
        for(int i=0;i<y.length;i++){
            for(int j=i+1;j<y.length;j++){
                if(y[i]>y[j]){
                    temp=y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }
            }
        }
        System.out.println("After sort");
        System.out.println(Arrays.toString(y));
    }
}
class printremoveduplicates{
    public static void main(String[] args) {
       int a[]={1,2,4,3,2,5,5,1,3};
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if((a[i]==a[j])&&(i!=j)){
                   System.out.println("The duplicate elemnt is "+a[i]);
               }
           }
       }
    }
}
class  vibrant {
    public static void main(String[] args) {
        int c[] = {22, 34, 55, 66, 22, 55, 66, 77, 88, 99, 34,};
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("\nThe duplicate Elements are:");
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && i != j)
                    System.out.print(c[i] + " ");
            }
        }
        for (int i = 0; i <c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    c[i]=-1;
                }
            }
        }
        System.out.println("\n after removiong duplicate Elements are:");
        for(int i=0;i<c.length;i++){
            if(c[i]!=-1){
                System.out.print(c[i]+" ");
            }
        }
    }
    }

 class deleting  {

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }
}
class sfgnl{
    public static void main(String[] args) {
        int a[]={14,24,32};
        int b[]={10,10,89};
        int c[]= new int [6];
        for(int i=0;i<3;i++){
            c[i]=a[i];
        }
        int j=0;
        for(int i=3;i<c.length;i++){
            c[i]=b[j];
            j++;
        }
        System.out.println(Arrays.toString(c));
        for(int i=0;i<3;i++){
            c[i]=a[i]*b[i];
            System.out.print(c[i]+" ");
        }
        for(int i=0;i<b.length;i++){
            c[i]=a[i]-b[i];
            System.out.print(c[i]+" ");
        }
    }
}
class awithextra {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int b[]={10,20,30};
        int len1=a.length;
        int len2=b.length;
        int small=len1<len2 ? len1:len2;
        int big=len1>len2 ? len1:len2;
        int c[]=new int[big];

        for(int i=0;i<small;i++)
        {
           c[i]=a[i]*b[i];
        }
        if(a.length<b.length){
            for(int i=small;i<c.length;i++){
                c[i]=b[i];
            }
        }else if (a.length>b.length){
            for(int i=small;i<c.length;i++){
                c[i]=a[i];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}






