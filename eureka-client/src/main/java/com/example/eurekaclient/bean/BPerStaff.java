package com.example.eurekaclient.bean;

import java.util.Date;
import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "b_per_staff")
public class BPerStaff {
    @Id
    @Column(name = "staffId")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")
    private Integer staffId;

    /**
     * 员工编号
     */
    @Column(name = "staffNo")
    private String staffNo;

    /**
     * 身份证号
     */
    @Column(name = "IDCard")
    private String IDCard;

    /**
     * 姓名
     */
    @Column(name = "staffName")
    private String staffName;

    /**
     * 曾用名
     */
    @Column(name = "formerName")
    private String formerName;

    /**
     * 性别var
     */
    @Column(name = "gender")
    private String gender;

    /**
     * 出生年月
     */
    @Column(name = "birthday")
    private String birthday;

    /**
     * 民族
     */
    @Column(name = "nation")
    private String nation;

    /**
     * 政治面貌var
     */
    @Column(name = "politics")
    private String politics;

    /**
     * 所属党支部
     */
    @Column(name = "partyBranch")
    private String partyBranch;

    /**
     * 婚姻状况var
     */
    @Column(name = "maritalStatus")
    private String maritalStatus;

    /**
     * 手机号
     */
    @Column(name = "cellphone")
    private String cellphone;

    /**
     * 电话号码
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 电子邮件
     */
    @Column(name = "email")
    private String email;

    /**
     * 家庭联系人
     */
    @Column(name = "contactPerson")
    private String contactPerson;

    /**
     * 家庭联系人电话
     */
    @Column(name = "contactPersonPhone")
    private String contactPersonPhone;

    /**
     * 家庭地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 最高学历
     */
    @Column(name = "education")
    private String education;

    /**
     * 毕业时间
     */
    @Column(name = "graduateDate")
    private String graduateDate;

    /**
     * 毕业院校
     */
    @Column(name = "graduateSchool")
    private String graduateSchool;

    /**
     * 毕业证书编号
     */
    @Column(name = "graduateCertificateNo")
    private String graduateCertificateNo;

    /**
     * רҵ
     */
    @Column(name = "departmentOfSchool")
    private String departmentOfSchool;

    /**
     * 援助证号码
     */
    @Column(name = "aidCertificateNo")
    private Integer aidCertificateNo;

    /**
     * 是否是特殊工种 0 :否 1：是
     */
    @Column(name = "isSpecwork")
    private Integer isSpecwork;

    /**
     * 特殊工种 var维护
     */
    @Column(name = "specwork")
    private String specwork;

    /**
     * 工种年份
     */
    @Column(name = "specworkYear")
    private Integer specworkYear;

    /**
     * 何时从事该职业
     */
    @Column(name = "specworkStartDate")
    private String specworkStartDate;

    /**
     * 员工退休到期天数
     */
    @Column(name = "remainDays")
    private Integer remainDays;

    /**
     * 籍贯
     */
    @Column(name = "nativePlace")
    private String nativePlace;

    /**
     * 户籍地址
     */
    @Column(name = "householdAddress")
    private String householdAddress;

    /**
     * 户口存放地
     */
    @Column(name = "householdKeptplace")
    private String householdKeptplace;

    /**
     * 户口转入时间
     */
    @Column(name = "householdRollInDate")
    private String householdRollInDate;

    /**
     * 户口转出时间
     */
    @Column(name = "householdRollOutDate")
    private String householdRollOutDate;

    /**
     * 原始档案转入时间
     */
    @Column(name = "recordRollInDate")
    private String recordRollInDate;

    /**
     * 原始档案存放地
     */
    @Column(name = "recordKeptplace")
    private String recordKeptplace;

    /**
     * 原始档案转出时间
     */
    @Column(name = "recordRollOutDate")
    private String recordRollOutDate;

    /**
     * 参加工作时间
     */
    @Column(name = "workTime")
    private String workTime;

    /**
     * 入党团时间
     */
    @Column(name = "partyTime")
    private String partyTime;

    /**
     * 健康状况
     */
    @Column(name = "healthState")
    private String healthState;

    /**
     * 退休是否提醒 0 ：不提醒 1 提醒
     */
    @Column(name = "isRemind")
    private Integer isRemind;

    /**
     * 邮政编码
     */
    @Column(name = "zipCoad")
    private String zipCoad;

    /**
     * 最高学位
     */
    @Column(name = "highestDegree")
    private String highestDegree;

    /**
     * 最高职称
     */
    @Column(name = "highestTitle")
    private String highestTitle;

    /**
     * 残疾人类型
     */
    @Column(name = "disabledMan")
    private String disabledMan;

    /**
     * 残疾人等级
     */
    @Column(name = "disableGrad")
    private String disableGrad;

    /**
     * 状态 0：删除 1：正常
     */
    @Column(name = "`state`")
    private Integer state;

    @Column(name = "`createUser`")
    private String createUser;

    @Column(name = "createTime")
    private Date createTime;

    @Column(name = "updateUser")
    private String updateUser;

    @Column(name = "updateTime")
    private Date updateTime;

    /**
     * 招工备案时间  来自招工备案反馈的时间
     */
    @Column(name = "recordTime")
    private String recordTime;

    /**
     * 退休到期提醒状态
     */
    @Column(name = "retirementState")
    private String retirementState;

    /**
     * 退休到期提醒反馈状态
     */
    @Column(name = "retirementBackState")
    private String retirementBackState;

    /**
     * 退休到期提醒反馈人
     */
    @Column(name = "retirementName")
    private String retirementName;

    /**
     * 户籍性质（Var表维护字段）
     */
    @Column(name = "hukou")
    private String hukou;
}