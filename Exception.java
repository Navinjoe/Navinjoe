import java.lang.Exception;
import java.io.*;
class Excepption {
    public static void main (String[]sfg){
        int a=10;
        int b=10;
        int c=0;
        try{

            int [] s=null;
//            System.out.println(s[1]);
            c=a/b;
            System.out.println("try block");
        }
        catch (ArithmeticException e){
            System.err.println("arithmetric exception");
        }
        catch (NullPointerException e){
            System.err.println("Null pointer exception");
        }
        catch (Exception e){
            System.err.println("error occured:");
        }
        finally {
            System.out.println("it printed whatever happened");
        }
        File dfgbn=new File("C:]\\Users\\Public\\Pictures\\new.pdf");
        if(dfgbn.mkdir()){
            System.out.println("sflgjnln");
        }
        try {
            FileInputStream fs=new FileInputStream(dfgbn);
        } catch (FileNotFoundException e)
        {
            System.err.println(e);
        }
        System.out.println(c);
        System.out.println("end of the program");
        }
    }



