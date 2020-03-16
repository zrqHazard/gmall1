package com.zrq.gmall.api.vo.product;

import com.zrq.gmall.api.pms.entity.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 */
@Data
public class ProductCategoryWithChildrenItem extends ProductCategory {
    private List<ProductCategory> children;
}
