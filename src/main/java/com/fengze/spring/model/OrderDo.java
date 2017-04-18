package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "tb_order")
public class OrderDo {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_price")
    private Double orderPrice;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "order_addr")
    private String orderAddr;

    @Column(name = "order_phone")
    private String orderPhone;

    @Column(name = "order_tel")
    private String orderTel;

    @Column(name = "order_desc")
    private String orderDesc;

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