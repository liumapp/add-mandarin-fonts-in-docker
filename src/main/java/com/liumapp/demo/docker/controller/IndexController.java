package com.liumapp.demo.docker.controller;

import com.liumapp.demo.docker.util.Doc2PDF;
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

    private String path = "/pdf/";

    @RequestMapping("")
    public void index () {
        System.out.println("this is index controller ,ready to convert test doc into pdf ");

        Doc2PDF doc2PDF = new Doc2PDF();
        doc2PDF.doc2pdf(path + "/test.pdf", path + "doc/test.doc");
    }

}
