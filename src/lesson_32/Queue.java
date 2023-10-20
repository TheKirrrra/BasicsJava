package lesson_32;

public interface Queue <T>{

    void addLast(T value);
    void addFirst(T value);
    T getFirst(); // значение "головы" списка
    T getLast(); // значение "хвоста" списка
    T remove(); // Удаляет первый элемент списка
    T removeFirst(); // Удаляет первый элемент списка
    T removeLast(); //Удаляет последний элемент списка

}
