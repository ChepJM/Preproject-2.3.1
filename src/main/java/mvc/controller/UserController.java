package mvc.controller;

import mvc.entity.User;
import mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String index(Model model) {
        User newUser = new User("John", "Doe", 17);
        userService.addUser(newUser);
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }
}
