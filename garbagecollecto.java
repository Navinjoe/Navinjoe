 class garbagecollectod{
     public static void main(String[] args) {
         garbagecollectod nn= new garbagecollectod();
         System.out.println(nn.hashCode());
         nn=null;
         System.gc();
         System.out.println("end of ther slfdjgnl");
     }
     protected void finalize(){
         for(int i=0;i<5;i++){
             System.out.println(i);
         }
     }
}
