package com.zrq.gmall.ums.service.impl;

import com.zrq.gmall.api.ums.entity.Role;
import com.zrq.gmall.ums.mapper.RoleMapper;
import com.zrq.gmall.api.ums.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
