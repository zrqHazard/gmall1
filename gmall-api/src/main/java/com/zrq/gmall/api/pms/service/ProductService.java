package com.zrq.gmall.api.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zrq.gmall.api.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zrq.gmall.api.vo.PageInfo;
import com.zrq.gmall.api.vo.product.PmsProductQueryParam;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
public interface ProductService extends IService<Product> {

    PageInfo<Product> listProduct(Page<Product> productPage, PmsProductQueryParam productQueryParam);

}
