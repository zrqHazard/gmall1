package com.zrq.gmall.pms.mapper;

import com.zrq.gmall.api.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrq.gmall.api.vo.product.ProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    List<ProductCategoryWithChildrenItem> listWithChildren(Integer id);
}
