package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
/*
 * @Data注解可以自动生成java类，包括getter，setter，tostring等方法，可以大大减少代码量
 */
@Data
@TableName("t_user")
public class UserDO {
    private Long id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 真实姓名 */
    private String realName;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;

    /** 注销时间（时间戳） */
    private Long deletionTime;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;

    /** 删除标识 (0：未删除，1：已删除) */
    private Integer delFlag;
}
