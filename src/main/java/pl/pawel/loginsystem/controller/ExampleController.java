package pl.pawel.loginsystem.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pablojev on 04.08.2017.
 */
@RestController
@CrossOrigin
public class ExampleController {

    @RequestMapping("/")
    public String home() {
        return "Please visit /show";
    }

    @RequestMapping("/show")
    @Secured("ROLE_ADMIN")
    public String show() {
        return "You're logged in!";
    }
}
