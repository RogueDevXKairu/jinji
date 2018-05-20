package com.fujitsu.jinji.controller;

import com.fujitsu.jinji.database.services.UserHr_Service;
import com.fujitsu.jinji.models.UserHR_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {
    @Autowired
    private UserHr_Service userHr_service;

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("user_hr_model",new UserHR_Model());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("hr_model") UserHR_Model hr_model){
        userHr_service.saveUserHR(hr_model);
        return "redirect:register";
    }

    @GetMapping("/viewpending")
    public String viewPendingUserHr(Model model){
        model.addAttribute("userPending", userHr_service.findAllPending());
        return "viewAllPending";
    }
}
