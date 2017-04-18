package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "tb_user")
public class UserDo {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "real_name")
    private String realName;

    private String email;

    @Column(name = "cell_phone")
    private String cellPhone;

    private String address;

    @Column(name = "user_type")
    private String userType;

    private String state;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    }