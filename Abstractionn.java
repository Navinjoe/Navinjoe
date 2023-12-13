interface Show{
    void show1();
    void show2();
    void show3();
    void show4();
}
interface print{
    void show5();
    void show6();
    void show7();
    void show8();
}

abstract class Uniq implements Show,print{

}


class u extends Uniq{
    @Override
    public void show1() {
        System.out.println("dflbn");

    }
    @Override
    public void show2() {
        System.out.println("hi");
    }

    @Override
    public void show3() {
        System.out.println("welcome to 3");

    }
    @Override
    public void show4() {
        System.out.println("welcomeasdb");

    }

    @Override
    public void show5() {
        System.out.println("welcomdsbe");

    }

    @Override
    public void show6() {
        System.out.println("welcome tonsf");

    }

    @Override
    public void show7() {
        System.out.println("welcome to uniq:");

    }

    @Override
    public void show8() {
        System.out.println("welcome");

    }
    public static void main(String[] args) {
        u b=new u();
        b.show1();
        b.show2();
        b.show3();
        b.show4();
        b.show5();
        b.show6();
        b.show7();
        b.show8();
    }
}
abstract class kings{
    abstract void vk();
}
class ace extends kings{
    void vk(){
        System.out.println("hello vierat;");
    }
}
class jacke extends kings{
    void vk() {
        System.out.println("welcome to jazz");
    }
}
class hyper{
    public static void main(String[] args) {
        kings bb=new jacke();
        bb.vk();
        kings ss=new ace();
        ss.vk();
    }
}
abstract class jude{
    abstract int run();
}
class bell extends jude{
    int run(){
        return 7;
    }
}
class vini extends jude{
    int run(){
        return 5;
    }
}
class Rm{
    public static void main(String[] args) {
        jude bb;
        bb=new bell();
        System.out.println("the rate of interest on rm is "+bb.run());
        bb=new vini();
        System.out.println("the rate of interset on local dm is "+bb.run());
    }
}
