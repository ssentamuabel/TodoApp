package org.pahappa.systems.todo.Services;
import org.pahappa.systems.todo.Models.User;

public interface UserServices {

    // method to register
    void register(User user);
    User login(String email, String password);

}
