package com.exception.springsecurityweb.support;

import lombok.Data;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/5
 * @time 下午12:42
 * @discription
 **/
@Data
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }
}
