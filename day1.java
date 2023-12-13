import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class day1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 6; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            System.out.println(i + 1);
        }
    }
}


    //basics
    class sample {
        int q;
        int b;                     // instance variable
        int sum;
        int pro;
        int diff;

        sample(int q, int b) {
            int sum = q + b;
            int diff = pro - sum;              //using constructor
            int pro = q * b;
            System.out.println(" The sum is " + sum);
            System.out.println(" The pro is " + pro);
            System.out.println("The diference is " + (pro - sum));

        }

        public static void main(String[] args) {
            sample xy = new sample(10, 6);  //using constructor it automatically allocates memory
            // special type of object to allocate memory
            // constructor,class should be same name
            //constructor has no return type

//            sample b = new sample();
//            b.q = 5;
//            b.b = 7;
//            b.sum = b.q + b.b;
//            System.out.println("The sum is " + (b.sum));
//            b.pro = b.q * b.b;
//            System.out.println("The pro is " + (b.pro));
//            b.diff = b.pro - b.sum;
//            System.out.println("The diff is " + (b.diff));


        }
    }
class hi {
    public static void main(String[] args) {
        for (int i =0; i <= 5; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.println(j);
            }
        }
    }
}

        class table {
            public static class cfg {
                public static void main(String[] args) {
                    Scanner h = new Scanner(System.in);
                    System.out.println("Enter the table u want:");
                    int n = h.nextInt();

                    for (int i = 1; i <= 20; i++) {
                        System.out.println(n + "*" + i + "=" + (n * i));
                    }
                }
            }
        }

        class avg {
            public static void main(String[] args) {
                Scanner ch = new Scanner(System.in);
                System.out.println("Enter first number");
                int num1 = ch.nextInt();
                System.out.println("Enter second  number");
                int num2 = ch.nextInt();
                System.out.println("Enter third number");
                int num3 = ch.nextInt();
                System.out.println("Enter fourth  number");
                int num4 = ch.nextInt();
                int avg = ((num1 + num2 + num3 + num4) / 4);
                System.out.println(avg);
            }


        }

class positiveness {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int x=in.nextInt();

        if(x>0){
            System.out.println("it is an positive number");
        }
        else if (x<0){
            System.out.println("it is not a positive number:");
        }
        else System.out.println("numberm is zero");
    }
}
 class greatestof3 {
     public static void main(String[] args) {
         Scanner v = new Scanner(System.in);
         System.out.println("enter the num 1 ");
         int x = v.nextInt();
         System.out.println("enter the num 2 ");
         int y = v.nextInt();
         System.out.println("enter the num 3 ");
         int z = v.nextInt();

         if((x>y) && (x>z)){
                 System.out.println( " x is the greatest number:");
             }
         else if((y>z)&&(y>x)){
             System.out.println(" y is the greatest");
         }
         else if((z>y)&&(z>x)){
             System.out.println(" z is the greatest");
         }
         else{
             System.out.println(" error");
         }


     }
 }


