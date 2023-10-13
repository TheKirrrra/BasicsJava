package lesson1_23.lesson_14;

import java.util.Random;
import java.util.Scanner;

/*
0 - пустая клетка
1 - был выстрел
8 - корабль
5 - попадание в кораблик
 */
public class SeaBattle {
    public static void main(String[] args) {
        startGame();
    }//Method Area
    public static void startGame() {
        int size = 5;
        int sizeBoat = 3;
        int boatsAmount = 2;
        //       int boatCoordinate = ;

        int countAttempts = 0;
        int goodShots = 0;

        int[][] field = new int[size+1][size+1];

   /*
    Проверка правильности задания границ генератора координат
    Random random = new Random();
        int testCounter = 0;
        for (int i = 0; i < 10000; i++) {
            int xCoordinate = random.nextInt(field.length - sizeBoat) + 1;
            if (xCoordinate == 4) {
                testCounter++;
            }
        }
        System.out.println("\nконец проверки." + testCounter);

    */

        readyToStart(size, sizeBoat, boatsAmount);
        int[] boatCoordinate = setBoats(field, sizeBoat, boatsAmount);
        //   setBoats(field, sizeBoat);
        showField(field);

        while (goodShots < sizeBoat) {
            Scanner scanner = new Scanner(System.in);

            int xCoordinate;
            int yCoordinate;

            // Получаем координаты клетки от игрока

            xCoordinate = getCoordinateFromPlayer("вертикали", size, field, boatCoordinate);
     //       System.out.println("Получено значение " + xCoordinate);
            yCoordinate = getCoordinateFromPlayer("горизонтали", size, field, boatCoordinate);

            boolean isGoodMove = makeMove(field, xCoordinate, yCoordinate);

            if (isGoodMove) goodShots++;

            showField(field);

            countAttempts++;

         //   goodShots = sizeBoat;
        } // end while
        System.out.println("Вы нашли все корабли! Поздравляю!");
        System.out.println("Кол-во ходов: " + countAttempts);

    }//Method Area

    public static boolean makeMove (int[][] field, int x, int y) {
        if (field[x][y] == 8) {
            field[x][y] = 5;
            return true;
        } else if (field[x][y] == 0){
            field[x][y] = 1; //была произведена попытка выстрелить
        }
        return false;

    }//Method Area

    private static int getCoordinateFromPlayer(String str, int size, int[][] field, int[] helpArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите координату по %s (число от 1 до %d)\n", str, size);
        int coordinate = 0;


        if (scanner.hasNextInt()) {
            coordinate = scanner.nextInt();
        }


        if (coordinate == 911) provideHint(field,helpArray);



        coordinate = (coordinate > 0 && coordinate <= size) ? coordinate : getCoordinateFromPlayer(str, size,field, helpArray);

        return coordinate;


    }  //Method Area

    public static void provideHint(int[][] field, int[] boatCoordinateArray) {
        // Зачеркнуть несколько пустых клеток.
        // Дать одну из координат (горизонт или верт), где есть корабли.
        System.out.println("Что-то полезное происходит!");
        System.out.printf("На строке %s точно-точно есть палуба корабля!", boatCoordinateArray[0]);



    }//Method Area

    private static void readyToStart(int size, int sizeBoat, int boatsAmount) {
        // Выводит правила игры
        // printf -> целое число %d; строку %s, число с запятой %f
        System.out.printf("Игра Морской Бой ведется на квадратном поле, размером %dx%d", size, size);
        System.out.printf("Количество кораблей на поле: %d ", boatsAmount);
        System.out.println("Игрок вводит координаты поля");
        System.out.println("Программа отображает историю ходов и их результативность на игровом поле");
        System.out.println("Игра заканчивается, когда все корабли найдены.");
        System.out.println("Для получения подсказки - введите 911 при вводе координат");
        System.out.println("Good Luck!");
        System.out.println("=========================================================================");



    }//Method Area

    public static void showField(int[][] field) {
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            if ( i == 0) {
      //          String result = "";
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < field.length; j++) {
      //              result += " " + j + " |";
                    sb.append(" ").append(j).append(" |");
                }
      //          System.out.println(result);
                System.out.println(sb.toString());
                //Распечатываем шапку поля
            } else {
                //Распечатываем строку поля
          //      String res = " " + i + " |";
                StringBuilder res = new StringBuilder(" ").append(i).append(" |");
                for (int j = 1; j < field.length; j++) {
         //           res += " " + getSymbolByIntValue(field[i][j]) + " |";
                    res.append(" ").append(getSymbolByIntValue(field[i][j])).append(" |");
                }
                System.out.println(res);

            }
        }


    }//Method Area

    public static char getSymbolByIntValue(int i){
        switch (i) {
            case 0:
                return '-';
            case 1:
                return '*';
            case 5:
                return '†';
            case 8: // в конечном коде, этот кейс лишний и подлежит замене
                return 'O';
            default:
                return '-';
        }
    } //Method Area

    private static int[] setBoats(int[][] field, int sizeBoat, int boatAmount) {

        Random random = new Random();

        // кораблик в пределах поля

        boolean isVertical = random.nextBoolean(); // генерирует true || false

        int xCoordinate, yCoordinate;
        
        if (isVertical) {
            // 6 (1..5) -> [0..4] -> [1..5]
            xCoordinate = random.nextInt(field.length - sizeBoat) + 1;
            yCoordinate = random.nextInt(field.length - 1) + 1;
            for (int i = xCoordinate; i < xCoordinate + sizeBoat; i++) {
                field[i][yCoordinate] = 8;
            }
            System.out.println(xCoordinate + " : " + yCoordinate);



        } else {
            xCoordinate = random.nextInt(field.length -1) +1;
            yCoordinate = random.nextInt(field.length -sizeBoat) +1;
            for (int i = yCoordinate; i < yCoordinate + sizeBoat; i++) {
                field[xCoordinate][i] = 8;
            }
            System.out.println(xCoordinate + " : " + yCoordinate);
        }

        return new int[]{xCoordinate, yCoordinate};

    }//Method Area

}// Class Area
