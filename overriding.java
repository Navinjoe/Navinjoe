class uniq{
    void show(){
        System.out.println("nklj");
    }
}
class animal extends uniq {
    void show(){
        System.out.println("jsopip");
        super.show();
    }
}
class dog extends animal{
    void show(){
        System.out.println("wefgnlj");
    }
}
class deer extends dog {
    void show() {
        System.out.println("slmfgnlkn");
    }
    public static void main(String[] args) {
        uniq ss;
        ss = new animal();
        ss.show();
        ss = new dog();
        ss.show();
        ss = new deer();
        ss.show();

    }
}

