import java.sql.SQLOutput;

class pp {
    public  static void  Op(){
        for( int r=1;r<10;r++){
            for(int c=1;c<10;c++){
                if(r==1 || r==9){
                    System.out.print("* ");
                }else if(c==1 || c==9){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

     public static int HP() {
        for(int r=1;r<7;r++){
            for(int c=1;c<7;c++){
                if(c==1 || c==6 || r==3){
                    System.out.print("H ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return 0;

     }
     public static int  Xp(){
        for(int r=1;r<10;r++){
            for(int c=1;c<10;c++){
                if (c==r || c==10-r){
                    System.out.print("X ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return 0;
     }public static int  vp(){
        for(int r=1;r<6;r++){
            for(int c=1;c<10;c++){
                if (c==r || c==10-r){
                    System.out.print("X ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return 0;
     }
     public static void SQH(){
        int al=65;
        for(int i=1;i<7;i++){
            for(int j=1;j<7;j++){
                if(i==1 || j==1 ){
                    System.out.print((char)(al+j));
                }
                else if(i==6||j==6){
                    System.out.print((char)(al+j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

     }
     static void hexagonalphallow(){
         for(int r=5;r<10;r++){
             for(int c=1;c<10;c++){
                 if (c==r || c==10-r){
                     System.out.print("X ");
                 }
                 else {
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
     for(int r=1;r<6;r++){
        for(int c=1;c<10;c++){
            if (c==r || c==10-r){
                System.out.print("X ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

     public static void main(String[] args) {
        Op();
         System.out.println();
        HP();
         System.out.println();
         Xp();
         System.out.println();
         vp();
         System.out.println();
         System.out.println();
         System.out.println();
         SQH();
         hexagonalphallow();
     }
}
