 import java.util.Scanner;
public class method {
    int a, b, c;

    ///METHOD
    public static int max(int height, int width, int breadth) {//passing parameters
        int vol;
        vol = height * width * breadth; // TO run this block use "max" method it returns the vol
        System.out.println(vol);
        return vol;
    }

    static void march()
    { //without using int and return
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        System.out.println("zoho dreamers");
        march();
        max(7, 8, 9);    // just by calling method name and  give arguments it return the vol
        max(5, 8, 9);    // just by calling method name and  give arguments it return the vol
        max(6, 8, 9);    // just by calling method name and  give arguments it return the vol
        max(65, 8, 9);    // just by calling method name and  give arguments it return the vol
        max(7, 86, 9);    // just by calling method name and  give arguments it return the vol

        //method invoking
        method naw = new method();
        naw.a = 10;
        naw.b = 10;
        naw.c = 10;
        System.out.println("hlo " + naw.blue());
        march();
        march();
    }

    //method invoking(no need to use static but need to use object)
    public int blue()
    { //no need to use static while using passing method
        return a * b * c;
    }  // method  invoking



    }


