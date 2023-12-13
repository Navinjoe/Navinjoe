package games;

import java.util.function.*;

@FunctionalInterface
interface gh{
    void ga();
    default void met(){
     System.out.println("dfgdf");
    }
}
class da{
    public static void main(String []args){
        gh f=()->
            System.out.println("hslfmgnl");
        f.ga();
    }
}
@FunctionalInterface
interface jk{
    int hl(int a,int b);
}
class daaa{
    public static void main (String[]aergs){
        jk g=(r,l)->r+l;
        System.out.println(g.hl(5,8));
    }
}

interface Student{
    void marks();
}
 class Stud implements Student {
   public void marks(){System.out.println("welcome to uniq:");}

    String name;
    int roll_no;
    int marks;

    public Stud(String name, int roll_no, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;

    }

    public static void main(String[] args) {
        Stud f = new Stud("navin", 4148, 95);
        Stud g = new Stud("sabari", 4147, 100);
        Function<Integer, Boolean> gg = (game) -> {
            return game >75;
        };
        Function<Integer, Boolean> gk = (game) -> {
            return game == 35;
        };
        f.marks();
        if (gg.apply(f.marks)&&(gg.apply(g.marks))) {
            System.out.println("Name" + ":" + f.name);
            System.out.println("Marks" + ":" + f.marks);
            System.out.println("Name" + ":" + g.name);
            System.out.println("Marks" + ":" + g.marks);
            java.util.Date bn=new java.util.Date();
            System.out.println(bn);
        } else if (gk.apply(f.marks)) {
            System.out.println("your are failure student go and study again:");
        }
    }
}





