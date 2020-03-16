package com.zrq.gmall.pms.service.impl;

import com.zrq.gmall.api.pms.entity.ProductFullReduction;
import com.zrq.gmall.pms.mapper.ProductFullReductionMapper;
import com.zrq.gmall.api.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
