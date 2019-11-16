package com.example.eurekaclient.service;

import com.example.eurekaclient.base.BaseService;
import com.example.eurekaclient.bean.BPerStaff;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

public interface BPerStaffService extends BaseService<BPerStaff> {

    List<BPerStaff> getStaffDiffField(BPerStaff b, Sqls sqls, Integer pageNo, Integer pageSize, String... fields);
}
