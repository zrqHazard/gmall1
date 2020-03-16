package com.zrq.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zrq.gmall.api.pms.entity.Brand;
import com.zrq.gmall.pms.mapper.BrandMapper;
import com.zrq.gmall.api.pms.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
