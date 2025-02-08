package com.nageoffer.shortlink.admin.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
/*
 * 用户持久层
 * UserMapper用于实现对数据库中用户增删改查功能
 * 继承BaseMapper接口可以不需要手写SQL语句
 */
public interface UserMapper extends BaseMapper<UserDO> {
}
