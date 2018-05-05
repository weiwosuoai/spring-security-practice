package com.exception.springsecurityweb.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/5
 * @time 下午9:04
 * @discription
 **/
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
