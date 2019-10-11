package com.way.mscteacher.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "address")
  private String address;

  @Column(name = "birth_date")
  private Date birthDate;

  @Column(name = "create_by")
  private String createBy;

  @Column(name = "create_time")
  private Timestamp createTime;

  @Column(name = "email")
  private String email;

  @Column(name = "gender")
  private Integer gender;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "last_update_by")
  private String lastUpdateBy;

  @Column(name = "last_update_time")
  private Timestamp lastUpdateTime;

  @Column(name = "name")
  private String name;

  @Column(name = "password")
  private String password;

  @Column(name = "phone")
  private Long phone;

  @Column(name = "point")
  private BigDecimal point;

  @Column(name = "remark")
  private String remark;

  @Column(name = "username")
  private String username;

  
}