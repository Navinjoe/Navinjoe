 class aggregation {
     String name;
     String age;

     public aggregation(String name, String age) {
         this.age = age;
         this.name = name;
     }
 }

    class game {
        String namee;
        int gls;
        aggregation astonvilla;

        public game(String namee, int gls, aggregation astonvilla) {
            this.namee = namee;
            this.gls = gls;
            this.astonvilla = astonvilla;
            System.out.println(namee+ " "+gls);
            System.out.println(astonvilla.name+" "+astonvilla.age);
        }
        public static void main(String[] args) {
            aggregation bb1 = new aggregation("trent", "khbnkb");
            aggregation bb2 = new aggregation("trensfdgbt", "khbnkgbb");
            game vv = new game("rg", 56, bb2);
            game vv2= new game("rgb", 5666, bb2);
        }
    }


