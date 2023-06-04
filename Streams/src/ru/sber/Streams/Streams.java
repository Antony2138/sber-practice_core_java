package ru.sber.Streams;
import java.util.*;
import java.util.stream.*;

public class Streams
{

    public static void main(String[] args) {
        List<Integer> Numbers = new Random().ints(10, 0, 99).boxed().collect(Collectors.toList());
        List<Integer> twoNumbers = Numbers.stream().filter(x -> x > 9 && x < 100).sorted().collect(Collectors.toList());
        System.out.println("Отсортированный двузначные числа: " + twoNumbers);
        double average = Numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println("Среднее значение:" + average);


        List<String> strings = Arrays.asList("One", "Two", "Three", "Four", "Five");
        List<StreamContainer> containers = strings.stream().map(x -> new StreamContainer(x, new Random().nextLong())).collect(Collectors.toList());
        containers.stream().forEach(System.out::println);
        Map<Long, String> map = containers.stream().collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));
        System.out.println(map);


        Map<String, List<StreamContainer>> MMap = new HashMap<>();
        MMap.put("one", Arrays.asList(new StreamContainer("one", 1), new StreamContainer("one", 2)));
        MMap.put("two", Arrays.asList(new StreamContainer("two", 3)));
        MMap.put("three", Arrays.asList(new StreamContainer("three", 4), new StreamContainer("three", 5), new StreamContainer("three", 6)));
        List<StreamContainer> flattenedList = MMap.values().stream().flatMap(List::stream).collect(Collectors.toList());
        long count = flattenedList.stream().count();
        System.out.println("Количество элементов: " + count);


        String binarString = "1011";
        boolean resultat = Stream.of(binarString.split("")).map(x -> x.equals("1")).reduce(true, (x, y) -> x && y);
        System.out.println("Результат через 'И': " + resultat);
    }
}
