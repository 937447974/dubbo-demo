package com.dubbo.service.impl;

import com.dubbo.LoginService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @title:
 * @time: 2021/12/11 2:41 δΈε
 * @author: ι³ε
 * @version: 1.0
 */
@DubboService
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String account, String password) {
        return "login";
    }

}
