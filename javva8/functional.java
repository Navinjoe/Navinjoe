package javva8;

import java.util.function.*;


class su{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String  getName(){
        return name;
    }
    public static void main(String []args){
        su v=new su();
        Predicate<String> cvb= strr->strr.length() >5;
        System.out.println(cvb.test("rsdgkjn"));

        Consumer<su> yad=tt->tt.setName("fangisdream");
        yad.accept(v);
        System.out.println(v.getName());

        Function<Integer ,String > vam= gg->gg*40+" is the multiples of 5*8";
        System.out.println(vam.apply(5));

        Supplier<Double>hk=()->Math.random();
        System.out.println(hk.get());
        java.util.Date vv=new java.util.Date();
        System.out.println(vv);
    }
}