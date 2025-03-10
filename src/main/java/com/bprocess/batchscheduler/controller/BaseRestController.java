package com.bprocess.batchscheduler.controller;

import com.bprocess.batchscheduler.model.Book;
import com.bprocess.batchscheduler.utils.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@Slf4j
public class BaseRestController {

    @GetMapping("/get")
    public ResponseEntity getRes(){
        log.info("-----------<<  API   >>---------");
        log.info(" Api response sent ...");
        log.info("-----------<<  API   >>---------");
        return ResponseEntity.ok("API");
    }

    @GetMapping("/json")
    public ResponseEntity getJson(){
        log.info("-----------<<  API   >>---------");
        log.info(" Api response sent ...");
        log.info("-----------<<  API   >>---------");
        Book book = new Book();
        book.setId(3);
        book.setName("Nice");
        return ResponseEntity.ok(new BaseResponse().Success(book));
    }

    @GetMapping("/err")
    public ResponseEntity getError(){
        log.info("-----------<<  API   >>---------");
        log.error(" Error Api response sent ...");
        log.info("-----------<<  API   >>---------");
        Book book = new Book();
        book.setId(3);
        book.setName("Nice");
        return ResponseEntity.badRequest().body(new BaseResponse().Error(book));
    }

}
