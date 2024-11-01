package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ruslan", "Perepelitsa", (byte) 22);
        userService.saveUser("Ivan", "Ivanov", (byte) 35);
        userService.saveUser("Petr", "Sidorov", (byte) 19);
        userService.saveUser("Vitaliy", "Utkin", (byte) 56);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
