import java.util.ArrayList;
//method overloading
class IMPTopics1{
     public static int jack(int a,int b){      //methods having same name but using differnt numberr or different typoe of parameters
        return a>b?a:b;
     } public static double jack(double a,double b){
        return a>b?a:b;
    }  public static char jack(char a,char b){
        return a>b?a:b;
    }
    }

 class imp{
    public static void main(String []args){
            System.out.println(IMPTopics1.jack(8,7));
            System.out.println(IMPTopics1.jack(8.88,7.88));
            System.out.println(IMPTopics1.jack('b','n'));
    }
 }

class EqualsIgnoreCaseExample2
{
public static void main(String[] args) {
        String str1 = "Mukesh KumaQr";
        String str2="giridharan";
        String str3="raja";
        ArrayList<String> list = new ArrayList<>();
        list.add("Mukesh");
        list.add("Raja");
        list.add("RAVI");
        list.add("Giridharan");
        list.add("Suresh");
        for (String str : list) {
        if (str.equalsIgnoreCase(str1)) {
        System.out.println("mohan  is present");
        }if (str.equalsIgnoreCase(str3)) {
        System.out.println("raja  is present");
        }if (str.equalsIgnoreCase(str2)) {
        System.out.println("giridharan  is present");
        }
        else {
        System.out.println("He is absent");
        }
        }
        }
        }

