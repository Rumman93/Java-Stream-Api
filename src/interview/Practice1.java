package interview;

import repostiroy.PracticeRepository;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */

/**
 * Video Link: <a href="https://youtu.be/1Ps5F1PU72M?si=keO7yNUyU8CEV15V">...</a>
 */
public class Practice1 {

    public static void main(String[] args) {

        String string = PracticeRepository.getString();

        //Count the occurrence of each character in a string
        Map<Character, Long> characterCountOne = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> characterCountTwo = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //Find all duplicate element from a given string
        Map<Character, Long> characterCountMap = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        List<Character> characterList = characterCountMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        Map<Character, Long> collect = characterCountMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //Find first non repeated element from given string
        String key = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get().getKey();

        //Find second highest number from a given array
        int[] primitiveArray = PracticeRepository.getPrimitiveArray();

        Optional<Integer> secondHighest = Arrays.stream(primitiveArray)
                .boxed()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .skip(1)
                .findFirst();

        Optional<Integer> optionalInteger = Arrays.stream(primitiveArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        //Find longest string from a given array
        String[] stringArray = PracticeRepository.getStringArray();

        String longestString = Arrays.stream(stringArray)
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length
                )).entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst().get().getKey();

        String s = Arrays.stream(stringArray)
                .reduce((e1, e2) -> e1.length() > e2.length() ? e1 : e2)
                .get();

        String s1 = Arrays.stream(stringArray)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        Optional<String> first = Arrays.stream(stringArray)
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst();

        //Find all element from arrays who starts with 1
        List<String> stringList = Arrays.stream(primitiveArray)
                .boxed()
                .map(String::valueOf)
                .filter(e -> e.startsWith("1"))
                .toList();

        List<String> stringList1 = Arrays.stream(primitiveArray)
                .mapToObj(i -> String.valueOf(i))
                .filter(e -> e.startsWith("1"))
                .toList();

        List<String> stringList2 = Arrays.stream(primitiveArray)
                .mapToObj(i -> i + "")
                .filter(e -> e.startsWith("1"))
                .toList();

        //String join example
        //append something

        String join = String.join("-", stringArray);

        //skip & limit (2-9)

        IntStream.range(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);

        //sort a list & map

        //map & flatmap


        // System.out.println(join);


    }
}
