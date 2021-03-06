package com.zrq.gmall.api.pms.service;

import com.zrq.gmall.api.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrq.gmall.api.vo.product.ProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    List<ProductCategoryWithChildrenItem> listWithChildren(Integer id);

}
