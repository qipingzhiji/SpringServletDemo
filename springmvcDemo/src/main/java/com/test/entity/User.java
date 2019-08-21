package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang_htao on 2019/8/13.
 */
@Data
public class User implements Serializable{
    private Integer id;
    private String userName;
    private String age;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NumberFormat(pattern = "#,###,###.#")
    private float salary;

    public User() {
    }

    public User(Integer id, String userName, String age, String password) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.password = password;
    }
}
