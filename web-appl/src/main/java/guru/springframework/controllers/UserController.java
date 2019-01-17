package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

public class UserController {

    public User saveUser(UserCommand userCommand){
        //fake impl
        return new User();
    }
}
