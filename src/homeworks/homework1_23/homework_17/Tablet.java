package homeworks.homework1_23.homework_17;

public class Tablet {

    String name;

    boolean internet;

    double memory;

    String system;

    double weight;

    int battery;

    boolean isWorking;

    public Tablet(String name, boolean internet, double weight, double memory, String system, int battery, boolean isWorking){
        this.name = name;
        this.internet = internet;
        this.weight = weight;
        this.memory = memory;
        this.system = system;
        this.battery = battery;
        this.isWorking = isWorking;
    }

    void turnON() { // Нельзя включить, если включен, а также если села батарея
        if (isWorking == false) {
            while (battery == 0) {
                System.out.println("Вы не можете его включить, он разряжен.");
                System.out.println("Нужно зарядить батарею, она сейчас " + battery);
                refillBattery();
            }
            isWorking = true;
            System.out.println("Планшет включается, пожалуйста подождите.");
            System.out.println("Загрузился. На данный момент, заряд батареи: " + battery);


        } else {
            System.out.println("Вы не можете включить, то что включено");
        }

    }

    void work() { // Нельзя работать если выключен. Также переходят в состояние выключен, когда села батарея.
        if (isWorking == true)
        {
            battery -= 10;
            System.out.println("Вы в планшете какое-то время, батарея садится.");
            System.out.println("Текущий заряд: " + battery);

            if (battery <= 50 && battery >= 10) {
                System.out.println("Пожалуйста зарядите батарею, у нее осталось: " + battery + " заряда.");
            } else if (battery < 10) {
                isWorking = false;
                System.out.println("Планшет сел. " + battery + " заряда батареи");
            }
        } else {
            System.out.println("Сначало включите/зарядите планшет. Текущая батарея: " + battery);
        }

    }

    void turnOFF() { // Нельзя выключить если выключен.
        if (isWorking == true) {
            isWorking = false;
            if (battery == 0) {
                System.out.println("Подсказка от внутреннего голоса -> Батарея села походу.");
            } else {
                System.out.println("Планшет выключается, подождите его выключения, прежде чем закрыть.");
                System.out.println("Выключился");
            }
        } else {
            System.out.println("Нельзя выключить то, что выключено.");
        }
    }

    void refillBattery() { // Нельзя зарядить больше 100%
        if (battery < 100) {
            System.out.println("Идёт зарядка батареи, на данный момент заряд составляет: " + battery + "%.");
            battery += 10;
        } else {
            System.out.println("Заряжать дальше не могу, так как заряда " + battery + "%.");
        }
    }


    String whatIsThis() {
        return "This is: " + name + ", it has weight of: " + weight + " kg. Internet situation is: " + internet + ". It work on " + system + " system. It has " + memory + "TB memory." + " Amount of energy in battery left: " + battery + "%";
    }
}

