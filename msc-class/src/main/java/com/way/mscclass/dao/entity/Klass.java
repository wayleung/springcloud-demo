package com.way.mscclass.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "klass")
@Data
public class Klass implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "create_by")
  private String createBy;

  @Column(name = "create_time")
  private Timestamp createTime;

  @Column(name = "grade")
  private Integer grade;

  @Column(name = "head_teacher_id")
  private Integer headTeacherId;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "klass")
  private Integer klass;

  @Column(name = "last_update_by")
  private Integer lastUpdateBy;

  @Column(name = "last_update_time")
  private Timestamp lastUpdateTime;

  @Column(name = "name")
  private String name;

  @Column(name = "remark")
  private String remark;

  
}