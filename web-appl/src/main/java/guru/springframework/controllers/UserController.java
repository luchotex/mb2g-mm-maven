package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import guru.springframework.mappers.UserMapper;

public class UserController {

    public User saveUser(UserCommand userCommand) {
        //fake impl
        return UserMapper.INSTANCE.convertToUser(userCommand);
    }
}
