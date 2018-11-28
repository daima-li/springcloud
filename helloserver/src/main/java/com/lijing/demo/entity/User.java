package com.lijing.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 用户表
 */
@Entity
@Data
@Table(name = "deparment")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private  String name;

    @DateTimeFormat(pattern = "yyyy--MM--dd HH:mm:ss")
    private Date createTime;

    @ManyToOne
    @JoinTable(name = "id")
    @JsonBackReference
    @Transient
    private Department department;

    @ManyToMany(cascade = {},fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
            joinColumns={@JoinColumn(name="user_id")},
            inverseJoinColumns={@JoinColumn(name="role_id")})
    private List<Role>  role;
}
