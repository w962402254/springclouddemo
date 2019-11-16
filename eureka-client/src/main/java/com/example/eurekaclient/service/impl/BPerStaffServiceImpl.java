package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.base.BaseServiceImpl;
import com.example.eurekaclient.bean.BPerStaff;
import com.example.eurekaclient.dao.BPerStaffMapper;
import com.example.eurekaclient.service.BPerStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

@Service
public class BPerStaffServiceImpl extends BaseServiceImpl<BPerStaff, BPerStaffMapper> implements BPerStaffService {

    @Autowired
    private BPerStaffMapper bPerStaffMapper;

    @Override
    public List<BPerStaff> getStaffDiffField(BPerStaff b, Sqls sqls,Integer pageNo, Integer pageSize, String... fields) {
        return this.queryByFiledBase(pageNo, pageSize, sqls, null, null, fields);
    }
}
