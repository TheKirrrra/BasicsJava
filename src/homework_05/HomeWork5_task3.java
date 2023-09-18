package homework_05;

public class HomeWork5_task3 {
    public static void main(String[] args) {
        String string = "string";
        String code = "code";
        String practice = "Practice";
        int length = 3;
        String str = string.substring( string.length()/2 - (length/2),string.length()/2 + (length/2) );
        String cod = code.substring( code.length()/2 - (length/2),code.length()/2 + (length/2) );
        String prac = practice.substring( practice.length()/2 - (length/2),practice.length()/2 + (length/2) );
        System.out.println(str + "\n" + cod + "\n" + prac);

    }
}
