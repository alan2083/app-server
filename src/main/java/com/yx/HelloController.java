package com.yx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yx on 17/2/3.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String say(){
        return "first spring boot project!";
    }
}
