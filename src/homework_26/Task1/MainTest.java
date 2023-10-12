package homework_26.Task1;

public class MainTest {
    public static void main(String[] args) {
        Human human = new Human("Обычный чел",10, 15);
        AmateurSportsman amateurSportsman = new AmateurSportsman("Любитель", 15,10);
        ProSportsman proSportsman = new ProSportsman("Профи",25,5);

        human.run();
        amateurSportsman.run();
        proSportsman.run();

    }
}
