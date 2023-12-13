class Aa extends Thread {
     public void run() {
         for (int i = 0; i < 6; i++) {
             System.out.println("*");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
            }
         }
     }
 }

     class bb extends Thread {

         public void run() {
             for (int i = 0; i < 6; i++) {
                 System.out.println("#");

             }
         }

         public static void main(String[] args) throws InterruptedException {
             Aa ob = new Aa();
             bb hj = new bb();
             ob.start();
             ob.join();
             hj.start();
             hj.join();
         }
     }


     class hjk implements Runnable {
     public void run(){
         char ch='A';
         for (int i = 1; i <= 5; i++) {
             for (int j = i; j <= 5; j++) {
                 System.out.print(ch+" ");
                 ch++;
             }
             System.out.println();//new line
         }
     }
     }
     class haf extends Thread{
    public void run(){
        for(char i='E';i>='A';i--){
            for(char j=i;j>='A';j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

     }
     class vkl{
    public static void main(String []args){
        Runnable hk=new hjk();
        Thread nn=new Thread(hk);
        haf vv=new haf();
        nn.start();
        vv.start();
    }
     }
class Cur extends Thread{
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("dbbb");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//
//            }
        }
        // print currently executing thread
    }
}

     class leoo extends Thread{
          public void run(){
              for(int i=0;i<15;i++){
                  System.out.println(i);
//                  try{
//                      Thread.sleep(1000);
//                  }
//                  catch (InterruptedException e){
//                  }
              }

         }

     public static void main(String args[]) throws InterruptedException {
         // creating two thread
         Cur nn=new Cur();
         leoo vv=new leoo();
         vv.start();
         vv.join();
         nn.join();
         nn.start();

         System.out.println("automatically");
     }
 }

//Synvhronized Thread
class tame {
      synchronized public void printa(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException f) {
                System.out.println(f);
            }
        }
    }
}
class kll{
    public static void main(String[] args)  {
       tame nn=new tame();
       Thread t1=new Thread(){
           public void run(){
               nn.printa(5);
           }
        };
       Thread t2=new Thread(){
           public void run(){
               nn.printa(80);
           }
       };
       t1.start();
       t2.start();
    }
}
class daemonr extends  Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("it daemon Thread");
        }else{
            System.out.println("its not a daemon thread");
        }
    }
}
class fghj{
    public static void main(String args[]){
        daemonr jj=new daemonr();
        daemonr kk=new daemonr();
        daemonr ll=new daemonr();
        jj.setDaemon(true);
        jj.start();
        kk.start();
        ll.start();
    }
}
class daae extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child");
        }
    }
    public static void main(String []args) throws InterruptedException {
        daae nn=new daae();
        nn.setDaemon(true);
        nn.start();
        System.out.println("main thread");
        System.out.println(nn.isDaemon());
    }
}
//inter thread
class th {
    int book = 50;

    public synchronized void fh(int book1) {
        if (book < book1) {
            System.out.println("wants to sell");

            try {
                wait();
            } catch (Exception e) {
                book -= book1;
                System.out.println("done");
            }
        } else {
            book -= book1;
            System.out.println("done");
        }
    }
        public synchronized void jk(int book2){
            book+=book2;
            System.out.println("succesfully loaded "+ book2);
            notify();

        }
    }

class Aaaa {
    public static void main(String[]args){
        th ob=new th();
        Thread t1=new Thread(){
          public void run(){
              ob.fh(100);
          }
        };
        Thread t2=new Thread(){
          public void run(){
              ob.jk(100);
          }
        };
        t1.start();
        t2.start();
    }
}
//inter class
 class car {
    private String brand;

        public  car(String brand){
            this.brand=brand;
        }
        public class engine{
            public void start()
            {
                System.out.println("Starting "+brand+" engine");
            }
        }

    public static void main(String[] args) {
       car my=new car("honda");
       car.engine bb=my.new engine();
       bb.start();
    }
}
//inter thread
class threasd{
    int a=10000;
    synchronized public  void widthdraw(int a){
        if(this.a<a) {
            System.out.println("insufficint balance");
            try {
                wait();
            }
            catch (Exception r) {
                System.out.println(r);
            }
        }
        this.a -=a;
        System.out.println("widthdraw succesfuly "+ a);
        System.out.println("your balance "+ this.a);
    }
    synchronized public  void deposit(int a ){
        System.out.println("deposit started");
        this.a +=a;
        System.out.println("deposited " +a+ " succesfully account balance is  " + this.a);
        notify();
    }
    public static void main(String [] args){
        threasd nn=new threasd ();
        new Thread(){
           public void run(){
               nn.widthdraw(15000);
           }
       }.start();
       Thread bb=new Thread(){
           public void run(){
               nn.deposit(10000);
           }
       };
       bb.start();

    }
}
class ThirdMaxFinder {
    public static Integer findThirdMaximum(Integer[] arr, int index, Integer first, Integer second, Integer third) {
        if (index < 0) {
            return third;
        }

        Integer element = arr[index];

        if (element > first) {
            third = second;
            second = first;
            first = element;
        } else if (second == null || element > second) {
            third = second;
            second = element;
        } else if (third == null || element > third) {
            third = element;
        }

        return findThirdMaximum(arr, index - 1, first, second, third);
    }

    public static void main(String[] args) {
        Integer[] arr = {0,5,3,8,7,9};
        Integer thirdMax = findThirdMaximum(arr, arr.length - 1, 0, null, null);
        System.out.println("The third maximum value is: " + thirdMax);
    }
}



