package com.risk.user;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * USER
 * @author 
 */
@Data
public class User implements Serializable {
    private BigDecimal id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}