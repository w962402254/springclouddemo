package com.example.eurekaclient.controller;

import com.example.eurekaclient.bean.BSysOrg;
import com.example.eurekaclient.service.BSysOrgService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.Sqls;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orgService")
public class BSysOrgController {

    @Autowired
    private BSysOrgService bSysOrgService;

    @CrossOrigin
    @GetMapping("/getOrg")
    public Map<String, Object> getOrg(BSysOrg bSysOrg){
        Map<String, Object> result = new HashMap<>(16);
        result.put("rows", bSysOrgService.queryListByWhere(bSysOrg));
        return result;
    }

    @CrossOrigin
    @PostMapping("/getOrgList")
    public Map getOrgList(@RequestBody BSysOrg bSysOrg, int pageNo, int pageSize){
        Map<Object, Object> hashMap = new HashMap<>();
        Sqls sqls = Sqls.custom();
        sqls.andBetween("orgId", 1000, 2000);
        sqls.andLike("orgName", "%测试%");
        PageInfo<BSysOrg> pageInfo = bSysOrgService.queryPageListByField(pageNo, pageSize, sqls, "orgId",
                "asc", "orgId", "orgName");
        hashMap.put("rows", pageInfo.getList());
        hashMap.put("total", pageInfo.getTotal());

        Map mytest = bSysOrgService.mytest();

//        PageInfo<BPerStaff> bPerStaffPageInfo = bPerStaffService.queryPageListByField(pageNo, pageSize, sqls, null, "asc", "IDCard");

        /*BSysOrg b = new BSysOrg();
        b.setOrgName("测试分公司");
        b.setManager("王五");
        b.setOrgId(1008);
        b.setLevel(2);
        b.setOrgIdPath("1000_1001_1008");
        int save = bSysOrgService.saveSelect(b);*/
        return hashMap;
    }

}
