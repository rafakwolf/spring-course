package com.rafakwolf.flightreservation.controllers;

import com.rafakwolf.flightreservation.entities.User;
import com.rafakwolf.flightreservation.repos.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private String redirect(String toPage) {
        return "redirect:/" + toPage;
    }

    @RequestMapping("/showReg")
    public String registrationPage() {
        return "login/registerUser";
    }

    @PostMapping("/registerUser")
    public String register(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return redirect("showLogin");
    }

    @RequestMapping("/showLogin")
    public String showLogin() {
        return "login/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return redirect("findFlights");
        } else {
            modelMap.addAttribute("msg", "Invalid user name or password");
            return "login/login";
        }
    }

    @RequestMapping("/findFlights")
    public String showFindFlights() {
        return "findFlights";
    }
}
