package com.abc;

import com.abc.dao.UserDao;
import com.abc.model.User;

public class App {
    public static void main(String[] args) {
        System.out.println("Hibernate E-Commerce App Running...");

        User user = new User();
        user.setName("Raj");
        user.setEmail("raj@example.com");

        new UserDao().saveUser(user);

        System.out.println("User saved successfully.");
    }
}
