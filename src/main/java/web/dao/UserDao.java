package web.dao;

import java.util.List;
import web.model.User;

public interface UserDao {
    void saveUser(User var1);

    void deleteUserDaoById(Long var1);

    void changeUserDaoById(User var1);

    List<User> allUsers();

    User findUserById(Long var1);
}
