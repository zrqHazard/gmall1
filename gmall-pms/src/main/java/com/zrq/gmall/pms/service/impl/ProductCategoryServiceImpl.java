package com.zrq.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zrq.gmall.api.constant.SystemConstant;
import com.zrq.gmall.api.pms.entity.ProductCategory;
import com.zrq.gmall.api.vo.product.ProductCategoryWithChildrenItem;
import com.zrq.gmall.pms.mapper.ProductCategoryMapper;
import com.zrq.gmall.api.pms.service.ProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public List<ProductCategoryWithChildrenItem> listWithChildren(Integer id) {

        List<ProductCategoryWithChildrenItem> productCategoryList = (List<ProductCategoryWithChildrenItem>) redisTemplate.opsForValue().get(SystemConstant.PRODUCT_CATEGORY);
        if (productCategoryList == null) {
            productCategoryList = baseMapper.listWithChildren(id);
            redisTemplate.opsForValue().set(SystemConstant.PRODUCT_CATEGORY,productCategoryList);
        }
        return productCategoryList;
    }
}
