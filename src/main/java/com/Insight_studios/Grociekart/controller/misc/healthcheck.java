package com.Insight_studios.Grociekart.controller.misc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grocie")
public class healthcheck {

    @GetMapping("/healthcheck")
    public String healthcheck(){
        return "ready for launch! ,standby!!";
    }
}
