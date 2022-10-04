package com.example.firstservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{username:[a-z]+}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("username") String username){
        Random random = new Random();
        int randompass = random.nextInt(1000000000);
        return ("Hi," + username + "\n" + "Your new password is " + randompass);
    }
}
