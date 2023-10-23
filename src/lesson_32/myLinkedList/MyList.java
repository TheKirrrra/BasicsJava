package lesson_32.myLinkedList;

public interface MyList<T> {
    void add(T value);

    void addAll(T... values);

    int size();

    int indexOf(T value);

    int lastIndexOf(T value);
    // содержит ли список элемент со значением value
    boolean contains(T value);
    // вернуть массив из элементов списка
    T[] toArray();
    // Удаление по значению. Первое вхождение с начала
    boolean remove(T value);
    // удаление по индексу
    T remove(int index);

    // Является ли коллекция пустой?
    boolean isEmpty();
    // дать значение элемента по индексу
    T get(int index);


}
