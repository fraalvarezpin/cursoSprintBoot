package cursoSprintBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping({"/saludo/{name}", "/sal/{name}"})
    public String greeting(@PathVariable String name) {
        return "Hola " + name;
    }

}