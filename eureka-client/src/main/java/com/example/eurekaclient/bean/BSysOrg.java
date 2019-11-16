package com.example.eurekaclient.bean;

import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "b_sys_org")

/*@NameStyle(Style.normal)
        normal,                     //原值
        camelhump,                  //驼峰转下划线
        uppercase,                  //转换为大写
        lowercase,                  //转换为小写
        camelhumpAndUppercase,      //驼峰转下划线大写形式
        camelhumpAndLowercase,      //驼峰转下划线小写形式*/

public class BSysOrg {
    /**
     * 组织ID
     */
    @Id
    @Column(name = "orgId")
    private Integer orgId;

    /**
     * 父组织ID
     */
    @Column(name = "parentId")
    private Integer parentId;

    /**
     * 组织代码
     */
    @Column(name = "orgCode")
    private String orgCode;

    @Column(name = "`level`")
    private Integer level;

    /**
     * 层次/级别
     */
    @Column(name = "orgIdPath")
    private String orgIdPath;

    /**
     * 机构名称
     */
    @Column(name = "orgName")
    private String orgName;

    /**
     * 全称
     */
    @Column(name = "fullName")
    private String fullName;

    /**
     * 组织机构类型：0公司，1部门，2中心，3小组
     */
    @Column(name = "orgType")
    private Integer orgType;

    /**
     * 负责人
     */
    @Column(name = "manager")
    private String manager;

    /**
     * 联系电话
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 是否支撑部门
     */
    @Column(name = "isSupport")
    private Integer isSupport;

    /**
     * 标识字段
     */
    @Column(name = "flag")
    private Integer flag;

    /**
     * 是否外地部门 0:不是 1:是
     */
    @Column(name = "isOtherplaces")
    private Integer isOtherplaces;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 是否显示标题
     */
    @Column(name = "isShowTitle")
    private Short isShowTitle;

    /**
     * 别名
     */
    @Column(name = "`alias`")
    private String alias;
}