package web.model.services;

import java.util.List;
import web.model.entity.User;

public interface UserService {
    void addNewUser(User user);

    void removeUserById(Long userID);

    void changeUser(User user);

    List<User> getListOfUsers();

    User getUserById(Long ID);
}

