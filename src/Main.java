import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//        Random random = new Random();
//        Integer[] array = new Integer[20];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-20, 20);
//        }
//        System.out.println(Arrays.toString(array));
//
//        long count = Arrays.stream(array).filter(x -> x > 0)
//                .count();
//
//        System.out.println("count : "+ count);


//        Stream<Programmer> programmers = Stream.of(
//                new Programmer("Esen", 28000, Language.BACKEND),
//                new Programmer("Mukhammed", 34000, Language.BACKEND),
//                new Programmer("Jumabek", 32000, Language.FRONTEND),
//                new Programmer("Chungyz", 45000, Language.ANDROID),
//                new Programmer("Aijan", 34000, Language.PYTHON),
//                new Programmer("Rahim", 32000, Language.FRONTEND));

//        programmers.sorted(Comparator.comparing(Programmer::getName)).forEach(System.out::println);
//        programmers.filter(s -> s.getName().startsWith("A")).forEach(System.out::println);
//        System.out.println(programmers.max(Comparator.comparing(Programmer::getSalary)).get());
//        System.out.println(programmers.min(Comparator.comparing(Programmer::getSalary)).get());
//        System.out.println(programmers.collect(Collectors.groupingBy(Programmer::getLanguage,
//                Collectors.groupingBy(Programmer::getLanguage))));
//        System.out.println(programmers.count());
//        programmers1.peek(programmer -> programmer.setName(programmer.getName().toUpperCase())).forEach(System.out::println);
//        programmers1.peek(programmer -> programmer.setName(programmer.getName().toLowerCase())).forEach(System.out::println);
//        programmers.skip(3).forEach(System.out::println)
//        System.out.println(programmers.map(Programmer::getName).toList());
//        System.out.println(programmers.map(Programmer::getSalary).reduce((double) 0, (a, b) -> a + b));
//        System.out.println(programmers.findFirst());
//        System.out.println(programmers.findAny());

//        List<String> list = new ArrayList<>();
//        list.add("Aigerim");
//        list.add("Aika");
//        list.add("Oomat");
//        list.add("Jarkynai");
//        list.add("Kanat");
//
//        list.stream().peek(System.out::print)
//                .map(String::length).forEach(s -> System.out.println(": "+s+ " tamga\n"));

        }
}