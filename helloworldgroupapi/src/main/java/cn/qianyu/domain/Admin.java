package cn.qianyu.domain;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "hello_admin")
public class Admin {
    private int id;
    private String username;
    private String password;
}
