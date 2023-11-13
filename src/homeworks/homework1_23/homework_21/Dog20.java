package homeworks.homework1_23.homework_21;

public class Dog20 {
    private String name;
    private int jumpHeight;

    private int increasePerOneTraining;
    private int maxJumpHeight;
    private static int counter; //подсчет количества собак, отсчет начинается с 0
    private static int counterJumps; //общее количество прыжков собак
    private final int id; //какая по счет собака "создана"






    public Dog20(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.increasePerOneTraining = 10;
        this.maxJumpHeight = jumpHeight * 2;
        this.id = counter++;
    }

    public void jump() {
        System.out.println(name + " прыгнула!");
        counterJumps++;
    }

    public void train() {

        if (jumpHeight < maxJumpHeight) {
            jumpHeight += increasePerOneTraining;
        }

        if (jumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        }

    }

    public boolean takeBarrier(int barrier) {
        // Текущий прыжок vs барьер?
        if (jumpHeight >= barrier) {
            jump();
            return true;
        }

        if (maxJumpHeight >= barrier) {
            // собачка может. Надо тренироваться
            System.out.println(name + " идет тренироваться");
            while (jumpHeight < barrier) {
                train();
            }
            jump();
            System.out.printf("Собака %s перепрыгивает барьер: %d!\n", name, barrier);
            System.out.println("Текущий прыжок: " + jumpHeight);

            return true;

        } else {
            System.out.printf("Барьер высотой %d собака %s взять не может!\n", barrier, name);
            System.out.println("Текущий прыжок: " + jumpHeight);
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public String toString() {
        return "id: " + id + " Dog " + name + "; current jump: " + jumpHeight + "\n Общее число прыжков всех собак: " + counterJumps;
    }

    public int getCounter() {return counter;}


}
