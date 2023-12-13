package javva8;
import java.util.*;
import java.util.stream.*;
   class project{
      public static void main(String[] args){
          List<movies>hit=Arrays.asList(new movies("leo",625,4023),
                  new movies("jailer",540,2043),new movies("jawan",1290,3043));

          hit.stream()
                  .filter(m->m.getCollec()>500).
                  map(movies::getName).sorted()
                  .forEach(System.out::println);
          String mov= hit.stream().map(movies::getName).collect(Collectors.joining(","));
          System.out.println("Ranking"+mov);
      }
}
class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        List<Integer> oddnumbers = numbers.stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(oddnumbers);
    }
}
class Mains {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(55, 46, 33, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Even numbers are:");
        numbers.stream()
                .filter(n->n%2==0).sorted().forEach(System.out::println);
        System.out.println("the odd numbers are:");
        numbers.stream()
                .filter(n->n%2==1).sorted().forEach(System.out::println);

    }
}

