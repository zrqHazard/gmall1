package com.zrq.gmall.pms.service.impl;

import com.zrq.gmall.api.pms.entity.ProductLadder;
import com.zrq.gmall.pms.mapper.ProductLadderMapper;
import com.zrq.gmall.api.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
