package com.example.eurekaclient.controller;

import com.example.eurekaclient.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/salaryService")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;


    @CrossOrigin
    @GetMapping("/getSalaryData")
    public List<Map<String, Object>> getSalaryData(@RequestParam("IDCard") String IDCard, @RequestParam("salaryDate") String salaryDate){
        if(StringUtils.isEmpty(IDCard) || StringUtils.isEmpty(salaryDate)){
            return new ArrayList<>();
        }
        return salaryService.getSalaryData(IDCard, salaryDate);
    }

    @CrossOrigin
    @GetMapping("/getSalaryEX")
    public List<Map<String, Object>> getSalaryEX(@RequestParam("salaryExcelData") String salaryExcelData) {
        List<Map<String, Object>> result = new ArrayList<>();
        if(StringUtils.isEmpty(salaryExcelData)){
            return result;
        }
        result = salaryService.getSalaryEX(salaryExcelData);
        return result;
    }

}
