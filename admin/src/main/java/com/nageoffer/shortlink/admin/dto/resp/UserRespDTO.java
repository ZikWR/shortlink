package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 用户返回参数响应
 * dto的含义是用户传输实体，只拿一些公开的属性
 */
@Data
public class UserRespDTO {
    private Long id;

    /** 用户名 */
    private String username;

    /** 真实姓名 */
    private String realName;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;

}
