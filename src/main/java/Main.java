import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
//        User user = new User("Alex",26);
////        userService.saveUser(user);
//        Auto ferrari = new Auto("Reno", "red");
//        user.addAuto(ferrari);
//        ferrari.setUser(user);
//        Auto ford = new Auto("Audi", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.saveUser(user);

        List<User> users = userService.findAllUsers();
        System.out.println(users);

//        userService.updateUser(user);
//        user.setName("Sasha");
//        userService.updateUser(user);
//        User user = userService.findUser(6);

//        userService.deleteUser(user);
//        Auto auto = userService.findAutoById(11);
//        System.out.println(auto);
    }
}
