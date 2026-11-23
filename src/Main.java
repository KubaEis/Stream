import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Petr", "Karel");/*
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        List<Integer> cisla = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        cisla.stream().filter(c -> c % 2 == 0).forEach(System.out::println);

        List<Integer> num = IntStream.rangeClosed(10,20).boxed().toList();
        num.stream().filter(n -> n % 3 == 0).forEach(System.out::println);

        List<String> names = Arrays.asList("Anna", "Petr");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> namesl = Arrays.asList("Anna", "Petr");
        namesl.stream().map(String::length).forEach(System.out::println);

        List<String> nameslu = namesl.stream().filter(name -> name.length() >= 4).map(String::toUpperCase).toList();
        System.out.println(nameslu);

        List<String> aNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        List<String> firstLNames = names.stream().map(name -> name.substring(0,1)).toList();
        List<String> joined = Collections.singletonList(names.stream().collect(Collectors.joining(", ")));
        System.out.println(firstLNames);

        long count = names.stream().filter(n -> n.length() > 3).count();
        long aCount = names.stream().filter(name -> name.startsWith("A")).count();
        boolean maneE = names.stream().filter(name -> name.contains("e")).count() > 0;
        System.out.println(aCount);
        System.out.println(maneE);*/

        Optional<String> first = names.stream().findFirst().filter(name -> name.length() > 3);
        System.out.println(first.get());









    }
}