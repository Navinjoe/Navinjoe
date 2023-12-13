import java.util.Arrays;

class grandfather{
    void display(){
        System.out.println("navin");
    }
}
class father extends grandfather {    //single inheritance
    void display() {
        System.out.println("vijay");
        super.display();
    }
}
class son extends father {           //multilevel inheritance
    void fig() {
        System.out.println("mancity");

    }

    public static void main(String[] args) {
        son v = new son();
        v.fig();
        v.display();
    }
}
//heirachiral
class fatherr{
    void display(){
        System.out.println("navin");
    }
}
class sonn extends fatherr {     //heirachiral inheritance
    void show() {
        System.out.println("vijay");
    }
}
class vann extends fatherr {
    void fig() {
        System.out.println("mancity");
    }
}
class mann extends fatherr{
    void gig(){
        System.out.println("halland\n" +
                "Anirudth");
    }
}
class hin{
    public static void main(String []args) {
        vann b = new vann();
        b.fig();
        b.display();

        sonn m = new sonn();
        m.show();
        m.display();

        mann v = new mann();
        v.gig();
        v.display();

    }
}




