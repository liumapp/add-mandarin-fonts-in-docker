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

    /**
     * 只能在docker下运行正常，如果要在idea调试，请确保宿主机doc和pdf目录存在，并拥有test.doc
     */
    private String pdfPath = "/pdf/";

    private String docPath = "/doc/";

    @RequestMapping("")
    public void index () {
        System.out.println("this is index controller ,ready to convert test doc into pdf ");

        Doc2PDF doc2PDF = new Doc2PDF();
        doc2PDF.doc2pdf(pdfPath + "wrongpdf.pdf", docPath + "test.doc");
    }

}
