package lessons.lesson24_48.lesson_34.test;

import lessons.lesson24_48.lesson_34.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestExample {

    @ParameterizedTest
    @MethodSource("dataForTestStreams")
    void exampleGetValuesByStream(int[] ints, String str, boolean isActive, Person person) {
        System.out.println(Arrays.toString(ints));
        System.out.println(str + " : " + isActive);
    }

    static Stream<Arguments> dataForTestStreams() {
        return Stream.of(
        Arguments.of(new int[]{1,3,5,6,}, "Hello", true, new Person("trrt", "trrt")),
        Arguments.of(new int[]{0,2,4,6}, "Java", false, null),
        Arguments.of(new int[]{5,66,7,13,2}, "Test data", true, null)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForArraysEqauls")
    void exampleArrayEzuals(int[] arr1, int[] arr2) {

    }

    static Stream<Arguments> dataForArraysEquals() {
        return Stream.of(
                Arguments.of(new int[]{5,4,9,0}, new int[]{5,4,9,0}),
                Arguments.of(new int[]{5,4,9,1}, new int[]{5,4,9,0})
        );


    }
}
