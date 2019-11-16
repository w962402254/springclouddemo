package com.example.eurekaclient.controller;

import com.example.eurekaclient.bean.BPerStaff;
import com.example.eurekaclient.service.BPerStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;


@RestController
@RequestMapping("/staffService")
public class BPerStaffController {

    @Autowired
    private BPerStaffService BPerStaffService;

    @CrossOrigin
    @GetMapping("/getStaff")
    public BPerStaff getStaff(BPerStaff b){
        Sqls sqls = Sqls.custom();
        sqls.andEqualTo("cellphone", b.getCellphone());
        sqls.orEqualTo("phone", b.getCellphone());
        List<BPerStaff> staffDiffField = BPerStaffService.getStaffDiffField(b, sqls,null,null,"cellphone", "phone");
        if(staffDiffField.size() == 0){
            return null;
        }
        return staffDiffField.get(0);
    }
}
