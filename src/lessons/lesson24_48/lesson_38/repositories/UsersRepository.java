package lessons.lesson24_48.lesson_38.repositories;

import lessons.lesson24_48.lesson_38.models.User;

public class UsersRepository {

    private static final int MAX_USERS_COUNT = 10;
    private User[] users;

    private int usersCount;

    public UsersRepository() {
        this.users = new User[MAX_USERS_COUNT];
    }

    public void save(User user) {
        this.users[usersCount] = user;
        this.usersCount++;
    }

    public boolean isExistsByEmail(String email) {
        for (int i = 0; i < usersCount; i++) {
            if (users[i].getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public User[] findAll() {
        User[] copy = new User[usersCount];
        for (int i = 0; i < usersCount; i++) {
            copy[i] = users[i];
        }
        return copy;
    }
}
