import java.util.*;
class Aarraylist {
    public static void main(String []args){
        ArrayList<Integer> game1=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            game1.add(i);
        }
        game1.add(200);
        game1.set(2,800);
        game1.remove(4);
        System.out.println(game1);
        System.out.println(game1.get(0));

        Iterator<Integer> hj=game1.iterator();   //using the iterator
        System.out.println("after using the iterator");
        while(hj.hasNext()){
            System.out.println(hj.next()+" ");
        }
        System.out.println();
        System.err.println(game1.add(5));
        System.out.println(game1);

        ArrayList kl=new ArrayList();
        kl.add("nahfkj");
        kl.add('c');
        kl.add(55);
        kl.add(true);
        kl.set(2,"ruomeo");
        int c=0;
        if( kl.contains(55)){
            c++;
        }
        System.out.println(c);
        System.out.println(kl);
        System.out.println(kl.get(2));
        kl.add(2,game1);
        System.out.println();
        System.out.println(kl);
        game1.addAll(3,kl);
        System.out.println(game1);

    }
}
// sets interface

class  hashset{
    public static void  main(String[]args){
        HashSet<String> hj=new HashSet();
        hj.add("orange");
        hj.add("apple");
        hj.add("white bees");
        hj.add("huddle");
        hj.add("huddle");
        System.out.println(hj);
        Iterator<String> h=hj.iterator();
        while(h.hasNext()){
            System.out.println(h.next());
        }
    }
}
class linkedset{
    public static void main(String[]args){
        LinkedHashSet<String> gl=new LinkedHashSet();
        gl.add("orange");
        gl.add("apple");
        gl.add("white bees");
        gl.add("white bees");
        gl.add("huddle");

        System.out.println(gl);
    }
}
class treeset{
    public static void main(String []args){
        TreeSet<String> fl=new TreeSet();
        fl.add("fgj");
        fl.add("apale");
        fl.add("capale");
        fl.add("cabale");
        fl.add("breadle");
        fl.add("apale");
        System.out.println(fl);
    }
}
class RemoveDuplicateArrayList {
    public static void main(String[] args) {
        String str=new String("");
        List l = new ArrayList ();
        l.add(101);
        l.add("sri");
        l.add(10);
        l.add('h');
        l.add(101);
        l.add(10);
        l.add(79);
        l.add('h');
        l.add(101);
        l.add("sri");

        System.out.println(l);
        Set<String> s = new LinkedHashSet<String>(l);
        System.out.println("After removing dup"+"\n"+s);
    }
}