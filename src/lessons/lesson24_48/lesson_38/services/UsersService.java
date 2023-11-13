package lessons.lesson24_48.lesson_38.services;

import lessons.lesson24_48.lesson_38.models.User;
import lessons.lesson24_48.lesson_38.repositories.UsersRepository;

public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void register(String firstName, String lastName, String email, String password) {

        if (usersRepository.isExistsByEmail(email)) {
            System.err.println("Пользователь с таким email уже есть");
            return;
        }

        User user = new User(firstName, lastName, email, password);

        usersRepository.save(user);
    }

    public User[] getAllUsers() {
        return usersRepository.findAll();
    }
}
