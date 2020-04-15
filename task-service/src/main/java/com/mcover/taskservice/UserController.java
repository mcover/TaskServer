package com.mcover.taskservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    private final AtomicLong idCounter = new AtomicLong();

    //this is only a get request that will increment id each time
    @GetMapping("/create_user")
    public User createUser(@RequestParam(value = "name") String name, @RequestParam(value = "passcode") String passcode) {
        return new User(idCounter.incrementAndGet(), name, hashPasscode(passcode));
    }

    public int hashPasscode(String code) {
        return code.hashCode(); //TODO-better hashing scheme, pull out into own service
    }
}
