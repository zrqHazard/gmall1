package com.zrq.gmall.pms.service.impl;

import com.zrq.gmall.api.pms.entity.ProductCategoryAttributeRelation;
import com.zrq.gmall.pms.mapper.ProductCategoryAttributeRelationMapper;
import com.zrq.gmall.api.pms.service.ProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
