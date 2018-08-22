package com.librarymansys.demo.user.domain;

import java.util.Date;

public class User {
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户昵称
     */
    private String userCode;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String telePhone;
    /**
     * 逻辑删除状态 0 未删除，1 删除
     */
    private Integer deleteStatus;
    /**
     * 是否锁定     0 未锁定；1 锁定
     */
    private Integer locked;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
