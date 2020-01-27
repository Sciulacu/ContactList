package ro.jademy.contactlist;

import ro.jademy.contactlist.model.User;
import ro.jademy.contactlist.service.UserService;

import java.util.Optional;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private UserService userService;

    public Menu(UserService userService) {
        this.userService = userService;
    }

    public void showMenu() {

        // example usage of Optional
        int id = 1;
        Optional<User> userOpt = userService.getContactById(id);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            // do some work with the User
        } else {
            System.out.println("Sorry, no user with id " + id + " exists");
        }

    }
}
