package com.example.eurekaclient.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SalaryMapper{

    List<Map<String, Object>> selectSalary(@Param("IDCard") String IDCard, @Param("salaryDate") String salaryDate);

    List<Map<String, Object>> getSalaryEX(@Param("salaryExcelData") String salaryExcelData);

}
