package lesson_32.myLinkedList;

public class MyLinkedList<T> implements Queue<T>, MyList<T> {

    private int size;

    private Node<T> first; //Ссылка на 1-ый вагон
    private Node<T> last; //Ссылка на 2-ой вагон

    @Override
    public void add(T value) { // Метод добавляет элемент в конец списка
        if (first == null) {
            //не существует ни одного узла
            first = new Node<>(value, null, null);
        } else if(last == null) {
            // существует только один узел (first)
            last = new Node<>(value, first,null);
            // следующий узел за first будет равен last
            first.next = last;
        } else {
            Node<T> temp = last;
            System.out.println(temp.previous);
            System.out.println(first.next);
            last = new Node<>(value, temp, null);
            temp.next = last;

            System.out.println("First: " + first);
            System.out.println("Last: " + last);
            System.out.println("temp: " + temp);
            System.out.println("====================");
        }

        size++;
    }

    @Override
    public void addLast(T value) {
        add(value);
    }

    // @Override
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            // кейс: есть только 1 нода.
            last = first;
            first = new Node<>(value,null,last);
            last.previous = first;
        } else {
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;
        }
        size++;
    }
    // Удалить самый(первый) левый узел
    @Override
    public T remove() {
        if (size == 0) return null;

        T value = first.value;
        if (size == 1) {
            first = null;

        } else if (size == 2){
            first = last;
            first.previous = null;
            last = null;

        }else {
            first = first.next;
            first.previous = null;
        }

        size--;
        return value;
    }

    @Override
    public T removeFirst() {
        return remove();
    }

    @Override
    public T removeLast() {
        if (size == 0) return null;
        T value;
        if (size == 1) {
            // только нода first
            value = first.value;
            first = null;
        } //сценарии, в которых мы удаляем ноду last
        else if (size == 2){
            // есть две ноды
            value = last.value;
            last = null;
            first.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }

        size--;
        return value;
    }

    @Override
    public T getFirst() {
        return (first == null ? null : first.value);
    }

    @Override
    public T getLast() {
        //TODO переписать, если в листе только 1 элемент, вернуть его значение
        T value = null;
        if (last != null) {
            value = last.value;
        }
        return value;
    }

    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;
            Node<T> cursor = first;
            while (cursor != null) {
                if (cursor.value.equals(value)) {
                    return index;
                }
                index--;
                cursor = cursor.next;
            }



        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        if (size == 0) { return -1;}
        int index = size - 1;
        Node<T> cursor = last;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            index--;
            cursor = cursor.previous;
        }
        if (size == 1) {
            if (first.value.equals(value)) {
                return 0;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        if (indexOf(value) != -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size()];

        int index = 0;
        for (T element : this) {
            array[index++] = element;
        }

        return array;
    }


    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        remove(index);
        return index >= 0;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.previous = null;
            } else {
                last = null;
            }
        } else if (index == size - 1) {
            last = last.previous;
            if (last != null) {
                last.next = null;
            } else {
                first = null;
            }
        } else {
            Node<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
        return null;

    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current;
        if (index < size / 2) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }
        return current.value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = (Node<T>) first.next;
            while (cursor != null) {
                sb.append("; ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node <T> { //Объект вагона
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
        @Override
        public String toString() {
            return "Node{" +
                    "value=" + (value != null ? value : "null") +
                    ", previous=" + (previous != null ? previous.value : "null") +
                    ", next=" + (next != null ? next.value : "null") +
                    '}';
        }

    }

    }



