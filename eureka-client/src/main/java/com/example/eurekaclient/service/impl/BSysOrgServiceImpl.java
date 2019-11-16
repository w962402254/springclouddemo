package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.base.BaseServiceImpl;
import com.example.eurekaclient.bean.BSysOrg;
import com.example.eurekaclient.dao.BSysOrgMapper;
import com.example.eurekaclient.service.BSysOrgService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BSysOrgServiceImpl extends BaseServiceImpl<BSysOrg, BSysOrgMapper> implements BSysOrgService {

    @Resource
    private BSysOrgMapper bSysOrgMapper;

    public BSysOrg selectById(int orgId){
        Example example = new Example(BSysOrg.class);
        example.selectProperties("orgId");

        List<BSysOrg> bSysOrgs = bSysOrgMapper.selectByExample(example);
        return bSysOrgMapper.selectByPrimaryKey(orgId);
    }

    @Override
    public Map mytest(){
        Map<String, Object> result = new HashMap<>(16);
        result.put("rows", bSysOrgMapper.mytest());
        return result;
    }
}
