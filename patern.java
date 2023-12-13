 class patern {
     public static void drawPatternN() {
         int c = 1;
         int h = 6;
         for (int i = 1; i <= h; i++) {
             for (int j = 1; j <= h; j++) {
                 if (j == h || j == 1 || j == c) {
                     System.out.print("N");
                 } else {
                     System.out.print(" ");
                 }
             }
             c++;
             System.out.println();
         }
     }

     public static int App() {
         for (int i = 1; i < 7; i++) {
             for (int j = 1; j < 7; j++) {
                 if (i == 1 || j == 1)
                     System.out.print("A");
                 else if (j == 6 || i == 4) {
                     System.out.print("A");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         return 0;
     }


     public static int Ip() {
         for (int r = 1; r < 6; r++) {
             for (int c = 1; c < 6; c++) {
                 if (r == 1 || c == 3 || r == 5) {
                     System.out.print("I ");
                 } else {
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }

         return 0;
     }

     public static int Vp() {
         for (int i = 1; i < 6; i++) {
             for (int j = 1; j < 10; j++) {
                 if (j == i || j == 10 - i) {
                     System.out.print("v");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         return 1;
     }

     public static int np() {

         int c = 1;
         for (int i = 1; i < 7; i++) {
             for (int j = 1; j < 7; j++) {
                 if (j == 1 || j == 6 || j == c) {
                     System.out.print("N");
                 } else {
                     System.out.print(" ");
                 }
             }
             c++;
             System.out.println();
         }
         return 1;
     }

     public static void main(String[] args) {
         drawPatternN();
         System.out.println();
         App();
         System.out.println();
         Vp();
         System.out.println();
         Ip();
         System.out.println();
         np();
         System.out.println();

     }
 }


