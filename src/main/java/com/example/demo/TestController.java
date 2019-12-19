package com.example.demo;

import com.example.demo.test.dao.ManyEntityDao;
import com.example.demo.test.dao.OneEntityDao;
import com.example.demo.test.domain.ManyEntity;
import com.example.demo.test.domain.OneEntity;
import com.example.demo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private OneEntityDao oneEntityDao;

    @Autowired
    private ManyEntityDao manyEntityDao;

    @GetMapping("/")
    public String home() {
        testService.add();
        return "index";
    }

    @GetMapping("/test")
    public String test() {
//        OneEntity oneEntity = oneEntityDao.findById(1L).get();
//        List<OneEntity> oneEntities = oneEntityDao.findAll();
        testService.many();
        return "test";
    }

    @GetMapping("/one")
    public String one() {
        testService.one();
        return "test";
    }
}
