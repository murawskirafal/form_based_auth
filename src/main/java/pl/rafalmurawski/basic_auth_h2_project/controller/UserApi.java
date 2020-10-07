package pl.rafalmurawski.basic_auth_h2_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalmurawski.basic_auth_h2_project.service.UserService;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    UserService userService;

    @GetMapping
    public String whoIsLgged() {
        return userService.whoIsLogged();
    }
}
