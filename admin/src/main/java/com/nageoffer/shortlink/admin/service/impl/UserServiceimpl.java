package com.nageoffer.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dao.mapper.UserMapper;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 用户接口实现层
 */
@Service
public class UserServiceimpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
    @Override
    public UserRespDTO getUserByUsername(String username) {
        /**
         * LambdaQueryWrapper<UserDO>：MyBatis-Plus 提供的 条件查询构造器，用于构建 WHERE 条件的查询语句。
         * Wrappers.lambdaQuery(UserDO.class)：创建一个 LambdaQueryWrapper<UserDO> 实例，指定查询的实体类 UserDO，方便使用 lambda 表达式指定查询字段。
         * .eq(UserDO::getUsername, username)：添加等值查询条件，相当于 SQL 语句：
         * SELECT * FROM t_user WHERE username = 'xxx';
         * 等价的 Java 代码（如果不使用 MyBatis-Plus）：
         * QueryWrapper<UserDO> queryWrapper = new QueryWrapper<>();
         * queryWrapper.eq("username", username);
         *
         * baseMapper.selectOne(queryWrapper)：
         * 调用 MyBatis-Plus 提供的 selectOne 方法，根据查询条件查找 唯一 符合的用户数据。
         * 如果数据库中有多条数据，会抛异常，因为 selectOne 期望只返回一条记录。
         * 查询结果存入 userDO 变量，其类型为 UserDO，即数据库中的用户实体对象。
         */
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        UserRespDTO result = new UserRespDTO();
        BeanUtils.copyProperties(userDO, result);
        return result;
    }
}
