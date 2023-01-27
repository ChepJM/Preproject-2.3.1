package mvc.service;

import mvc.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void updateUserById(int id);
    void deleteuserById(int id);
    void addUser(User user);
}
