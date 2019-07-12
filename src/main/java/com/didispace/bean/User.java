package com.didispace.bean;

import lombok.Data;

import javax.persistence.*;

// 下面的@Getter ，@Setter 注解也可用 @Data代替，
// 使用 @Data可直接生成getter，setter
// 标明是一个实体类
@Data
@Entity(name="user")
// 定义映射的表
@Table(name="t_user")
public class User {

    // 标明主键
    @Id
    //主键策略，递增,GenerationType.IDENTITY 代表依赖数据库递增策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 定义属性和表的映射关系
    @Column(name = "username")
    private String userName;



    private String note;

}
