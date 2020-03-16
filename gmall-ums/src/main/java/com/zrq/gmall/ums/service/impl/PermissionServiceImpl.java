package com.zrq.gmall.ums.service.impl;

import com.zrq.gmall.api.ums.entity.Permission;
import com.zrq.gmall.ums.mapper.PermissionMapper;
import com.zrq.gmall.api.ums.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
