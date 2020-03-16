package com.zrq.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zrq.gmall.api.pms.entity.Product;
import com.zrq.gmall.api.vo.PageInfo;
import com.zrq.gmall.api.vo.product.PmsProductQueryParam;
import com.zrq.gmall.pms.mapper.ProductMapper;
import com.zrq.gmall.api.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public PageInfo<Product> listProduct(Page<Product> productPage, PmsProductQueryParam productQueryParam) {
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>();

        Long brandId = productQueryParam.getBrandId();
        if (brandId != null) {
            productQueryWrapper.eq("brand_id",brandId);
        }

        String keyword = productQueryParam.getKeyword();
        if (!StringUtils.isEmpty(keyword)) {
            productQueryWrapper.like("name",keyword);
        }

        String productSn = productQueryParam.getProductSn();
        if (!StringUtils.isEmpty(productSn)) {
            productQueryWrapper.like("product_sn",productSn);
        }

        Long productCategoryId = productQueryParam.getProductCategoryId();
        if (productCategoryId != null) {
            productQueryWrapper.eq("product_category_id",productCategoryId);
        }

        Integer publishStatus = productQueryParam.getPublishStatus();
        if (publishStatus != null) {
            productQueryWrapper.eq("publish_status",publishStatus);
        }

        Integer verifyStatus = productQueryParam.getVerifyStatus();
        if (verifyStatus != null) {
            productQueryWrapper.eq("verify_status",verifyStatus);
        }

        baseMapper.selectPage(productPage,productQueryWrapper);

        PageInfo<Product> productPageInfo = new PageInfo<>();
        productPageInfo.setTotal(productPage.getTotal());
        productPageInfo.setTotalPage(productPage.getPages());
        productPageInfo.setPageSize(productPage.getSize());
        productPageInfo.setPageNum(productPage.getCurrent());
        productPageInfo.setList(productPage.getRecords());

        return productPageInfo;
    }
}
