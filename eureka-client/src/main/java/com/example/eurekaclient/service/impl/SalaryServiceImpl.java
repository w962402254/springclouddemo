package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.dao.SalaryMapper;
import com.example.eurekaclient.service.SalaryService;
import com.example.eurekaclient.util.RegexUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Resource
    private SalaryMapper salaryMapper;

    @Override
    public List<Map<String, Object>> getSalaryData(String IDCard, String salaryDate) {
        List<Map<String, Object>> list = salaryMapper.selectSalary(IDCard, salaryDate);
        String salaryExcelData;
        for (Map<String, Object> map : list) {
            salaryExcelData = (String) map.get("salaryExcelData");
            map.put("salaryExcelData", RegexUtil.removeUselessChar(salaryExcelData));
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> getSalaryEX(String salaryExcelData) {
        return salaryMapper.getSalaryEX(salaryExcelData);
    }


}
