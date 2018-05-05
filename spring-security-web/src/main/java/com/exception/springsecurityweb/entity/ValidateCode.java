package com.exception.springsecurityweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/5
 * @time 下午8:17
 * @discription 图形验证码
 **/
@Data
public class ValidateCode implements Serializable {

    private BufferedImage image;
    private String code;
    private LocalDateTime expireTime;

    public ValidateCode(BufferedImage image, String code, LocalDateTime expireTime) {
        this.image = image;
        this.code = code;
        this.expireTime = expireTime;
    }

    /**
     * 多少秒后过期
     *
     * @param image
     * @param code
     * @param expireAfter
     */
    public ValidateCode(BufferedImage image, String code, int expireAfter) {
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireAfter);
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
