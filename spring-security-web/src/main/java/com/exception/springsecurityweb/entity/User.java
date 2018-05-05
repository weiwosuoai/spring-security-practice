package com.exception.springsecurityweb.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/4
 * @time 下午3:28
 * @discription
 **/
@Data
public class User implements Serializable {
    private String username;
    private String password;
}
