package com.sparta.week01_3_mvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class LoginController {
    @GetMapping("/login")
    public String getlogin() {
        return "redirect:/login-form.html";
    }

    @PostMapping("/login")
    public String postlogin(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
        System.out.println("id : " + id);
        System.out.println("pw : " + pw);
        if(id.equals(pw)){
            model.addAttribute("loginId",id);
        }
        return "login-result";
    }

}
