package com.example.dockerdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoEntity {

    @Id
    private int id;
    private String centerName;
    private String centerAddress;
}
