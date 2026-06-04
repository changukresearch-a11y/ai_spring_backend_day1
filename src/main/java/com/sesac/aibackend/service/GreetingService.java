package com.sesac.aibackend.service;

//import com.sesac.aibackend.util.MessageFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    public String hello(String name) {
        return "[INFO] Hello, " + name + "!";
    }
}

