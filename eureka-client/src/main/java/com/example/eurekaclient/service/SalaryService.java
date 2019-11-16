package com.example.eurekaclient.service;


import java.util.List;
import java.util.Map;

public interface SalaryService {

    List<Map<String, Object>> getSalaryData(String IDCard, String salaryDate);

    List<Map<String, Object>> getSalaryEX(String salaryExcelData);
}
