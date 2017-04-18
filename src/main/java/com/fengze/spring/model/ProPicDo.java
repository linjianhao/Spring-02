package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "tb_prod_pic")
public class ProPicDo {
    @Id
    @Column(name = "pic_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer picId;

    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "pic_uri")
    private String picUri;

    @Column(name = "is_order")
    private String isOrder;

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