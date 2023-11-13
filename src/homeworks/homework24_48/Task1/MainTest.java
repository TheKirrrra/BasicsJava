package homeworks.homework24_48.Task1;

public class MainTest {
    public static void main(String[] args) {
        Human human = new Human(10, 15);
        AmateurSportsman amateurSportsman = new AmateurSportsman(15,10);
        ProSportsman proSportsman = new ProSportsman(25,5);

        human.run();
        amateurSportsman.run();
        proSportsman.run();

    }
}
