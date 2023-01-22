package com.felixwc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * in order to learn java!
 * created at 2023/1/1 19:28
 *
 * @author felixwc
 */
@RestController
@Slf4j
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/up")
    public String fileUp(MultipartFile multipartFile) throws IOException {
        multipartFile.transferTo(new File("./test/"+multipartFile.getOriginalFilename()));
        return null;
    }

    @ExceptionHandler(IOException.class)
    public String ioException(){
        return null;
    }
}
