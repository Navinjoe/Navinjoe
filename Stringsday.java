 import java.util.Scanner;
class Stringsday {
     public static void main(String[] args) {
         String a="romeo tj";
         String b="romeo ceasammaa";
         int k=0;
         for(int i=0;i<b.length();i++) {
             if(b.charAt(i)=='a'){
               k++;
             }
         }
         System.out.println("the a count="+k);
         String c="romeo ceasa";
         System.out.println(a);
         System.out.println(b);
         System.out.println(a.hashCode());
         System.out.println(b.hashCode());
         System.out.println(c.hashCode());
         System.out.println(a.length());
         System.out.println(a.toUpperCase());
         System.out.println(a.charAt(3));
         System.out.println(a.replace("tj","villo"));
         System.out.println(a.contains("tj"));
         System.out.println(a.isEmpty());
         System.out.println(b.substring(6,11));
         System.out.println(b.substring(0,5));
         System.out.println(b.substring(0,5));
         System.out.println(a.substring(6,8));
         System.out.println(b.length());
         char[] aar=b.toCharArray();
         System.out.println(aar);
     }
}
class String_buffer{
    public static void main(String[] args) {
        StringBuffer ne=new StringBuffer("navin joe");
        System.out.println(ne);
        ne.append("javamaster");
        System.out.println(ne);
        ne.insert(19,"2023");
        System.out.println(ne);
        ne.delete(19,23);
        System.out.println(ne);
        ne.replace(0,5,"wipro");
        System.out.println(ne);
        ne.reverse();
        System.out.println(ne);
        ne.setCharAt(0,'%');
        System.out.println(ne);
    }
}
class Stringbuilder{
    public static  void main(String[]afdf){
        StringBuilder n=new StringBuilder("Navin--&& KingN @@123 ");
        int upper=0,lower=0,space=0,vowels=0,number=0,N=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)>=65 && n.charAt(i)<=90){
                upper++;
            }
            if(n.charAt(i)>=97&& n.charAt(i)<=122){
                lower++;
            }
            if(n.charAt(i)==32){
                space++;
            }
            if(n.charAt(i)>=48&& n.charAt(i)<=57){
                number++;
            }
            if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='0'||n.charAt(i)=='u'){
                vowels++;
            }
        }
        System.out.println("uperr :" +upper);
        System.out.println("Lower:"+lower);
        System.out.println("space:"+space);
        System.out.println(" vowel count is:"+vowels);
        System.out.println(" the numbers are :"+number);
        System.out.println("symbols:" + (n.length()-(upper+lower+space+number)));
    }
}
class charfind{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the String:");
        String sa=n.next();
        int[] count=new int[255];
        for(int i=0;i<sa.length();i++)
        {
            count[(int)sa.charAt(i)]++;
        }
        for(int i=0;i<255;i++){
            if(count[i]!=0){
                System.out.println((char)i+" =="+count[i]);
            }
        }
    }
}
 class printdupl {
     public static void main(String[] args) {
         String n="romeroooasdfnsdgnfvveekk";
         int count;

         //Converts given string into character array
         char[] s = n.toCharArray();

         System.out.println("Duplicate characters in a given string: ");
         //Counts each character present in the string
         for (int i = 0; i < s.length; i++) {
             count = 1;
             for (int j = i + 1; j < s.length; j++) {
                 if (s[i] == s[j] && s[i] !=' ') {
                     count++;
                     //Set stringArray[j] to 0 to avoid printing visited character
                     s[j] = 0;
                 }
             }
             //A character is considered as duplicate if count is greater than 1
             if (count > 1 && s[i] != 0)
                 System.out.print(s[i]+" ");
         }
     }
 }
 class redp{
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
                     i=0;
                     j=0;
                     length=length-1;
                 }
             }
         }
         System.out.println(nn+" ");
     }
 }
  class stringintopalindrome {
     public static void main(String[] args) {
         Scanner bn=new Scanner(System.in);
         System.out.println(" Enter the String");
         String str =bn.next();
         makePalindrome(str);

     }
     public static String makePalindrome(String str) {
         String revers= new StringBuilder(str).reverse().toString();
         String a=str+revers;
         System.out.println( "the palindrome of the string is "+"\n"+a);
         return a;
     }
 }



