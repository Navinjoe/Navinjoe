 class TwoArray {
     public static void main(String[] args){
         int a[][]={{10,20,30,40},
                    {20,30,45},
                    {50,60,70,20}};
         for(int k[]:a){
             for( int l:k){
                 System.out.print(" "+l);
             }
             System.out.println(" ");
         }
     }

}
