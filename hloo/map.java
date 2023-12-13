package hloo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Properties;
public class map {
    public static void main (String[]asrgs) throws IOException {
        Map bb=new TreeMap();
        bb.put(105,"raehsg");
        bb.put(102,"vigneshsg");
        bb.put(103,"suresh");
        Set g=bb.keySet();
        System.out.println(bb);
        System.out.println("the keys are"+g);
        Collection m=bb.values();
        System.out.println("the values are"+m);
        Set s2=bb.entrySet();
        Iterator i=s2.iterator();
        while (i.hasNext()){
            Map.Entry kk=(Map.Entry) i.next();
                System.out.println(kk.getKey()+" "+kk.getValue());
            }
        }
    }

//    class map_f{
//        public static void main(String[]args) {
//            HashMap d= new HashMap();
//            d.put(f,23);
//            d.put(24);
//            System.out.println(d);
//        }
//    }


class firstpropertties{
    public static void main (String[]args) throws IOException {
        Properties p=new Properties();
        FileInputStream f=new FileInputStream("C:\\Users\\Navin joe\\IdeaProjects\\java basics\\src\\hloo\\text.properties");
        p.load(f);
        System.out.println(p);
        String  ss=p.getProperty("25");
        System.out.println(ss);
        p.setProperty("55","valfg");
        FileOutputStream fo= new FileOutputStream("C:\\Users\\Navin joe\\IdeaProjects\\java basics\\src\\hloo\\text.properties");
        p.store(fo,"updated marksheet");
    }
}