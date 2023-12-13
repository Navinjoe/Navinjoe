import java.util.*;
import oops.encapsulation;

public class joe {
    public static void main(String[] args)  {
        encapsulation s=new encapsulation();
        Scanner bb=new Scanner(System.in);
        System.out.println("enter the name");
         String setname=bb.next();
         s.setName(setname);
        System.out.println(s.getName());
        System.out.println("enter the number");
        int setage=bb.nextInt();
        s.setAge(setage);

        System.out.println(s.getAge());
        s.setPass('g');
        System.out.println(s.getpass());
    }
}
