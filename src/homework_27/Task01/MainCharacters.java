package homework_27.Task01;

public class MainCharacters {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Archer archer = new Archer();
        Wizard wizard = new Wizard();
        Monk monk = new Monk();
        FistFighter fistFighter = new FistFighter();
        
        GameCharacter[] characters = new GameCharacter[5];
        characters[0] = warrior;
        characters[1] = archer;
        characters[2] = wizard;
        characters[3] = monk;
        characters[4] = fistFighter;
        
        for (GameCharacter gameCharacter : characters) {
            System.out.println(gameCharacter);
            gameCharacter.attack();
            System.out.println("======================\n");
        }
        
    }
}
