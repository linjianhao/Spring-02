package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "tb_prod_car")
public class ProCarDo {
    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "prod_id")
    private Integer prodId;

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