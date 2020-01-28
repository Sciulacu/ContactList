package ro.jademy.contactlist;

import ro.jademy.contactlist.service.MemoryUserService;

public class Main {

    public static void main(String[] args) {

        // create a contact list of users
        // list contact list in natural order
        // list contact list by a given criteria
        // display a favorites list
        // search by a given or multiple criteria
        // display some statistics for the contact list

        Menu menu = new Menu(new MemoryUserService());
        menu.showMenu();
    }
}
