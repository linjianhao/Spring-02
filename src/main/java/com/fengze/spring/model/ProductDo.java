package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "tb_product")
public class ProductDo {
    @Id
    @Column(name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proId;

    @Column(name = "pro_name")
    private String proName;

    @Column(name = "pro_real_price")
    private Double proRealPrice;

    @Column(name = "pro_now_price")
    private Double proNowPrice;

    @Column(name = "is_stock")
    private String isStock;

    @Column(name = "pro_desc")
    private String proDesc;

    @Column(name = "pro_size")
    private String proSize;

    @Column(name = "pro_color")
    private String proColor;

    @Column(name = "pro_score")
    private Double proScore;

    @Column(name = "pro_type_id")
    private String proTypeId;

    @Column(name = "pro_pic_id")
    private Integer proPicId;

    @Column(name = "pro_pic_uri")
    private String proPicUri;

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