package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "tb_prod_detail")
public class ProDetDo {
    @Id
    @Column(name = "det_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detId;

    @Column(name = "prod_id")
    private Integer prodId;

    @Column(name = "det_length")
    private String detLength;

    @Column(name = "det_height")
    private String detHeight;

    @Column(name = "det_width")
    private String detWidth;

    @Column(name = "det_mate")
    private String detMate;

    @Column(name = "det_addr")
    private String detAddr;

    @Column(name = "det_date")
    private Date detDate;

    @Column(name = "det_desc")
    private String detDesc;

    private Integer state;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

   }