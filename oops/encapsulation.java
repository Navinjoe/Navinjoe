
package oops;

public class encapsulation {
     private String name;
     private int age;
     private char pass;

    public void setName(String name)
    {this.name = name;}
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setPass( char pas){
        this.pass=pas;
    }
    public int getpass(){
        return pass;
    }

}