package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "tb_prod_comment")
public class ProComDo {
    @Id
    @Column(name = "com_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comId;

    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "com_title")
    private String comTitle;

    @Column(name = "com_desc")
    private String comDesc;

    @Column(name = "pro_score")
    private Double proScore;

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