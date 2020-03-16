package com.zrq.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zrq.gmall.api.ums.entity.Admin;
import com.zrq.gmall.ums.mapper.AdminMapper;
import com.zrq.gmall.api.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {


    @Override
    public Admin login(String username, String password) {
        //Spring自带的md5工具类
        String digest = DigestUtils.md5DigestAsHex(password.getBytes());

        Admin admin = baseMapper.selectOne(new QueryWrapper<Admin>()
                .eq("username", username)
                .eq("password", digest));
        return admin;
    }

    @Override
    public Admin getOneAdmin(String userName) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>().eq("username", userName);
        return baseMapper.selectOne(queryWrapper);
    }
}
