package lessons.lesson24_48.lesson_30.generics;

public interface Calculated <T extends Number> {
    T sum(T v1, T v2);

}
