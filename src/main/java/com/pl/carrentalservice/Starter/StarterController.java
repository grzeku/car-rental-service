package com.pl.carrentalservice.Starter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StarterController {

    @GetMapping("/starter/{name}")
    public String starerPage(@PathVariable String name, final Model model) {
        model
                .addAttribute("name", name)
                .addAttribute("message", "Hello");
        return "starter";
    }
}