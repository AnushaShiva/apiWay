package com.example.apiWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

        @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/trainServiceFallBack")
    public String trainServiceFallBackMethod() {
        return "Train Service is taking longer than Expected." +
                " Please try again later";
    }


    @GetMapping("/bookingServiceFallBack")
    public String bookingServiceFallBackMethod() {
        return "Booking Service is taking longer than Expected." +
                " Please try again later";
    }
}
