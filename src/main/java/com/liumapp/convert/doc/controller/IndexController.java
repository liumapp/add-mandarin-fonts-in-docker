package com.liumapp.convert.doc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/5/18
 */
@RestController
@RequestMapping("")
public class IndexController {

    @RequestMapping("")
    public void index () {
        System.out.println("this is index controller ,ready to convert test doc into pdf ");
    }

}
