package com.zrq.gmall.api.vo.product;

import com.zrq.gmall.api.pms.entity.ProductAttribute;
import com.zrq.gmall.api.pms.entity.ProductAttributeCategory;
import lombok.Data;

import java.util.List;

/**
 * 包含有分类下属性的vo
 */
@Data
public class PmsProductAttributeCategoryItem extends ProductAttributeCategory {
    private List<ProductAttribute> productAttributeList;


}
