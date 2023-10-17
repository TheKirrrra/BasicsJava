package lesson_28;

public class Table {

    public class Printer {

        private final String prefix;

        public Printer(String prefix) {
            this.prefix = prefix;
        }

        public void print() {
            for (int i = 0; i < count; i++) {
                Pair current = pairs[i];
                System.out.println(prefix + " " + current);
            }
        }
    }

    public static class Pair {

        private String key;

        private int value;

        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key + "-" + value;
        }
    }

    private int count;
    private final Pair[] pairs;
    public Table() {
        this.pairs = new Pair[10];
        this.count = 0;
    }

    public void put(String key, int value) {

        for (int i = 0; i < count; i++) {
            Pair current = pairs[i];

            if (current.key.equals((key))) {
                current.value = value;
                return;
            }
        }

        Pair newPair = new Pair(key,value);

        pairs[count] = newPair;
        count++;
        
    }

    public int get(String key) {
        for (int i = 0; i < count; i++) {
            Pair current = pairs[i];

            if (current.key.equals(key)) {

                return current.value;
            }
        }

        return 0;
    }

    public int getCount() {
        return count;
    }

    public Pair[] getPairs() {
        return pairs;
    }
}


