package org.pahappa.systems.todo.Services;
import org.pahappa.systems.todo.Models.User;

interface UserServices {

    // method to register
    void register(User user);
    void login(String email, String password);

}
