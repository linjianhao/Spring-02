package com.fengze.spring.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;
@Data
@Table(name = "tb_prod_type")
public class MenuDo {
    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "type_p_id")
    private Integer typePId;

    @Column(name = "menu_uri")
    private String menuUri;

    @Column(name = "menu_style")
    private String menuStyle;

    @Column(name = "is_menu")
    private String isMenu;

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