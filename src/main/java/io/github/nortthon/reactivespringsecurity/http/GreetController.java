package io.github.nortthon.reactivespringsecurity.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
public class GreetController {

    @GetMapping("/home")
    public String greetAdmin(Principal principal) {
        return "Welcome " + principal.getName();
    }
}
