package Assignment12;

import java.util.*;

public class StreamApi {
    public static void main(String[] args){
        //filtering
        List<Integer> ages = Arrays.asList(12, 18, 25, 16, 40, 30);
        System.out.println("People eligible to vote");
        ages.stream().filter(age ->age>=18).forEach(System.out::println);

        //mapping
        List<String> names = Arrays.asList("john", "emma", "alex");
        System.out.println("Students name in Uppercase");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //sorting top scores
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);
        System.out.println("Students score in descending order");
        scores.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //collecting data
        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++", "JMeter");
        List <String > jBooks = books.stream().filter((book) -> book.toLowerCase().startsWith("j")).toList();
        System.out.println("Books starting with j: " + jBooks);

        //reducing data
        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);
        int totalSales = sales.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Total Weekly Sales: " + totalSales);

        //finding data
        List<Integer> marks = Arrays.asList(30, 45, 60, 75, 40);
        Integer firstPass = marks.stream().filter(mark -> mark > 50).findFirst().orElse(null);
        System.out.println("FirstPass: " + firstPass);

    }
}
