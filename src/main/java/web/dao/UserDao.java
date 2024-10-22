package web.dao;

import java.util.List;
import web.model.User;

public interface UserDao {
    void saveUser(User user);

    void deleteUserDaoById(Long ID);

    void changeUserDao(User user);

    List<User> allUsers();

    User findUserById(Long ID);
}
