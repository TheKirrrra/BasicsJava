package lesson_38.view;

import lesson_38.models.User;
import lesson_38.services.UsersService;

import java.util.Scanner;

public class Menu {
    private UsersService usersService;

    public Menu(UsersService usersService) {
        this.usersService = usersService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Регистрация");
            System.out.println("2. Показать всех пользователей");
            System.out.println("0. Выход");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0: {
                    System.out.println("Выходим из программы...");
                    System.exit(0);
                } break;

                case 1: {
                    String firstName = scanner.nextLine();
                    String lastName = scanner.nextLine();
                    String email = scanner.nextLine();
                    String password = scanner.nextLine();

                    usersService.register(firstName, lastName, email, password);
                } break;
                case 2: {
                    User[] users = usersService.getAllUsers();

                    for (int i = 0; i < users.length; i++) {
                        System.out.println(users[i].getFirstName() + " " + users[i].getLastName());
                    } break;
                }
            }
        }
        }
    }
