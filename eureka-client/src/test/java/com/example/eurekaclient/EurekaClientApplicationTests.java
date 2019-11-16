package com.example.eurekaclient;

import com.example.eurekaclient.service.SalaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {

    @Autowired
    private SalaryService salaryService;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> list = salaryService.getSalaryData("33018419880620632X", "2019-01");
        System.out.println(111);
    }

}
