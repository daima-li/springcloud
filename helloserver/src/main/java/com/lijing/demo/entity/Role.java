package com.lijing.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "role")
public class Role implements Serializable {

    @Id
    private  Integer id;

    private  String name;
}
