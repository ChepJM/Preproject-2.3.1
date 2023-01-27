package mvc.DAO;

import mvc.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    User getUserById(int id);
    void updateUserById(int id);
    void deleteuserById(int id);
    void addUser(User user);
}
