package com.zrq.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zrq.gmall.api.ums.entity.AdminLoginLog;
import com.zrq.gmall.ums.mapper.AdminLoginLogMapper;
import com.zrq.gmall.api.ums.service.AdminLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
@Component
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
