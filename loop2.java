import java.util.Scanner;
 class Pattern {

     //Single pyramid
     public static void main(String[] args) {
         System.out.println("Normal square PATTERN");
         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 5; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println();
         ///downward traingle
         System.out.println(" left pyramid triangle");
         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
             System.out.println();//new line
         }
         System.out.println();

         System.out.println("Downward triangle ");
         for (int i = 1; i <= 5; i++) {
             for (int j = i; j <= 5; j++) {
                 System.out.print("$ ");
             }
             System.out.println();//new line
         }
         System.out.println(" Right triangle");
         for (int i = 1; i <= 5; i++) {
             for (int j = i; j <= 5; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println();
         System.out.println("rightside downward triangle");
         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print("  ");
             }
             for (int j = i; j <= 5; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println();
         System.out.println("HIll Pattern");
         for (int i = 1; i <= 5; i++) {
             for (int j = i; j <= 5; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j < i; j++) {
                 System.out.print("* ");
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println("Reverse hill");
         for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("  ");
             }
             for(int j=i;j<5;j++){
                 System.out.print("* ");
             }
             for(int j=i;j<=5;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println("Hexagonal Pattern");
         for (int i = 1; i <= 5; i++) {
             for (int j = i; j <= 5; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j < i; j++) {
                 System.out.print("* ");
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("  ");
             }
             for(int j=i;j<5;j++){
                 System.out.print("* ");
             }
             for(int j=i;j<=5;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }

     }
 }
class hallow_pattern{
    public static void main(String args[]) {
        int n=20;

        for(int i=0; i <n; i++) {

            for (int j =0; j < n; j++) {

                if ( i == 0  ||  j == 0 || i == n-1
                        || j == n-1)
                {
                    System.out.print("n");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

     class dd {
         public static void main(String[] args) {
             int arr[] = {3, 5, 10};
             for (int j : arr) {
                 System.out.print(j);
             }
         }
     }

     //    for loop
     class sorry {
         public static void main(String[] args) {
             String nav = ".Developer navin";
             for (int i = 0; i <= 10; i++)
                 System.out.println(nav);
         }
     }

     class divisible {
         public static void main(String[] args) {
             int arr[] = {5, 6, 7, 8, 9};
             int sum = 0;
             Scanner nav = new Scanner(System.in);
             System.out.println("enter a number");
             int a = nav.nextInt();
             while (a > 0) {
                 if (a % 6 == 0) {
                     System.out.println(a);
                 }
                 a--;
             }
             //for each loop//
             System.out.println("welcome to programming");
             for (int j : arr) {
                 sum += j;
             }
             System.out.println("the sum is " + sum);
         }
     }

     //continue
     class div {
         public static void main(String[] args) {
             for (int i = 1; i <= 10; i++) {
                 if (i == 5) {
                     continue;
                 }
                 System.out.println(i);
             }
         }
     }



