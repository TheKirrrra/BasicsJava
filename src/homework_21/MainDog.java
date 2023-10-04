package homework_21;

public class MainDog {
    public static void main(String[] args) {

        Dog20 dog = new Dog20("Max", 54);

        System.out.println(dog.toString());

//        System.out.println("Собака, которую зовут: " + dog.getName());
//        System.out.println("Собака умеет прыгать на: " + dog.getJumpHeight()
//                + " сантиметров" );

        int[] barriers = {50, 150, 85, 120, 107, 112};

        int countTaken = 0;

        for (int barrier: barriers) {
            System.out.println("Новый барьер: " + barrier);
            boolean isTaken =  dog.takeBarrier(barrier);
            if (isTaken) countTaken++;
            System.out.println("===========================\n");
        }

        System.out.println("\nСобака преодолела " + countTaken + " барьеров");

        Dog20 dog1 = new Dog20("Boris", 54);

        System.out.println(dog1.toString());


        int[] barriers1 = {50, 150, 85, 120, 107, 112};

        int countTaken1 = 0;

        for (int barrier1: barriers1) {
            System.out.println("Новый барьер: " + barrier1);
            boolean isTaken1 =  dog.takeBarrier(barrier1);
            if (isTaken1) countTaken1++;
            System.out.println("===========================\n");
        }

        System.out.println(dog1.toString());

    }
}
