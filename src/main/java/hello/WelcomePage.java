package hello;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class WelcomePage {
    @RequestMapping
    public String index() {

        return "Welcome to the Plash welcome page";
    }
}
