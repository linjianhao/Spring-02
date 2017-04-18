package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "tb_order_detail")
public class OrderDetDo {
    @Id
    @Column(name = "detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "pro_id")
    private Integer proId;

    @Column(name = "pro_name")
    private String proName;

    @Column(name = "pro_desc")
    private String proDesc;

    @Column(name = "pro_size")
    private String proSize;

    @Column(name = "pro_color")
    private String proColor;

    @Column(name = "pro_num")
    private Integer proNum;

    @Column(name = "pro_price")
    private Double proPrice;

    @Column(name = "tal_price")
    private Double talPrice;

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