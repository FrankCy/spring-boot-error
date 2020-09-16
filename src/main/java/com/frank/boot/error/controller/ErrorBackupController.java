package com.frank.boot.error.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author cy
 * @version ErrorBackupController.java, v 0.1 2020年09月16日 16:57 cy Exp $
 */
@RestController
public class ErrorBackupController {

    @RequestMapping(name = "/sendOjbk", method = RequestMethod.GET)
    public String sendOjbk(){
        return "";
    }

}
