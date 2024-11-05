package interview;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 30 Oct 2024
 */

import repostiroy.PracticeRepository;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Video Link:
 */
public class Practice2 {

    public static void main(String[] args) {

        int[] primitiveArray = PracticeRepository.getPrimitiveArray();

        //sum of all element in list

        int sum = Arrays.stream(primitiveArray)
                .sum();

        int sum1 = Arrays.stream(primitiveArray)
                .reduce(0, Integer::sum);

        Integer summation = Arrays.stream(primitiveArray)
                .boxed()
                .collect(Collectors.summingInt(Integer::intValue));

        //sum of odd element in list
        int oddSum = Arrays.stream(primitiveArray)
                .filter(e -> e % 2 == 1)
                .sum();

        //check if all element are odd in a list
        boolean allOddMatch = Arrays.stream(primitiveArray)
                .allMatch(e -> e % 2 == 1);

        boolean noneEvenMatch = Arrays.stream(primitiveArray)
                .noneMatch(e -> e % 2 == 0);

        //average of a list
        OptionalDouble average = Arrays.stream(primitiveArray)
                .average();

        System.out.println(average);


    }
}
