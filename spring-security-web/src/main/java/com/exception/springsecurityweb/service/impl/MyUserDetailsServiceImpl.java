package com.exception.springsecurityweb.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/4
 * @time 下午3:40
 * @discription 处理用户信息获取逻辑
 **/
@Slf4j
@Service
public class MyUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("username: {}", username);
        // query the user info by the username
        // todo
        // 密码加解密
        String encodePassword = passwordEncoder.encode("123456");
        log.info("the encode password: {}", passwordEncoder);
        return new User(username, encodePassword, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
