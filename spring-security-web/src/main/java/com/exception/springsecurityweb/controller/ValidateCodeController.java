package com.exception.springsecurityweb.controller;

import com.exception.springsecurityweb.entity.ValidateCode;
import com.exception.springsecurityweb.utils.ValidateCodeUtil;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author jiangbing(江冰)
 * @date 2018/5/4
 * @time 下午3:05
 * @discription 验证码
 **/
@RestController
public class ValidateCodeController {

    public static final String SESSION_KEY = "SESSION_KEY_VALIDATE_CODE";

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();

    @GetMapping("/validateCode/image")
    public void getValidateCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ValidateCode validateCode = ValidateCodeUtil.generateCodeAndPic();
        sessionStrategy.setAttribute(new ServletWebRequest(request), SESSION_KEY, validateCode);
        ImageIO.write(validateCode.getImage(), "JPEG", response.getOutputStream());
    }

}