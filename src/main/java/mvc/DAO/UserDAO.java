package mvc.DAO;

import mvc.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    User getUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);
    void addUser(User user);
}
