package com.yx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yx on 17/2/3.
 */
@RestController
public class HelloController {

    @Value("${peopleName}")
    private String peopleName;

    @Autowired
    private CarProperties carProperties;

    /**
     * 也可使用RequestMapping
     */
    @GetMapping(value = "/hi1/{id}")
    public String say1(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId){
        return "first spring boot project!" + " id:" + myId;
    }

    @RequestMapping(value = "/hi2/{id}", method = RequestMethod.GET)
    public String say2(@PathVariable("id") Integer id){
        return "first spring boot project!" + " id:" + id;
    }

    /**
     * 使用hello或hi,都可以访问
     */
    @GetMapping(value = {"/hello","/hi"})
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId){
        return "Hello Spring Boot!" + peopleName + "'s car brand:" + carProperties.getBrand()
                + ", price:" + carProperties.getPrice()
                + " myId:" + myId;
    }
}
