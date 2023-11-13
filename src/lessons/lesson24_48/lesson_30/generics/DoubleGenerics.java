package lessons.lesson24_48.lesson_30.generics;

public class DoubleGenerics <T, E> {
    private T name;
    private E value;

    private E[] arrays;

    public DoubleGenerics(T name, E value) {
        this.name = name;
        this.value = value;
        this.arrays = arrays;
    }

    @Override
    public String toString() {
        return "DoubleGenerics{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        DoubleGenerics<String, Integer> testGeneric = new DoubleGenerics<>("John",100);
        System.out.println(testGeneric);
        DoubleGenerics<Double, Double> testGeneric2 = new DoubleGenerics<>(10.5,10.0);
        System.out.println(testGeneric2);
    }
}
