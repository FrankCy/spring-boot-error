package com.frank.boot.error.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author cy
 * @version ErrorController.java, v 0.1 2020年09月16日 16:55 cy Exp $
 */
@RestController
public class ErrorController {
    @RequestMapping(name = "/putFile", method = RequestMethod.GET)
    public String putFile(){
        return "";
    }
}
