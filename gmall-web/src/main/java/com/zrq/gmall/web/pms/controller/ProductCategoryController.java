package com.zrq.gmall.web.pms.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zrq.gmall.api.to.CommonResult;
import com.zrq.gmall.api.vo.product.PmsProductCategoryParam;
import com.zrq.gmall.api.pms.service.ProductCategoryService;
import com.zrq.gmall.api.vo.product.ProductCategoryWithChildrenItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品分类模块Controller
 */
@RestController
@Api(tags = "商品分类管理")
@RequestMapping("/productCategory")
@CrossOrigin
public class ProductCategoryController {
    @Reference
    private ProductCategoryService productCategoryService;

    @ApiOperation("添加产品分类")
    @PostMapping(value = "/create")
    public Object create(@Validated @RequestBody PmsProductCategoryParam productCategoryParam,
                         BindingResult result) {
        //TODO 添加产品分类
        return new CommonResult().success(null);
    }

    @ApiOperation("修改商品分类")
    @PostMapping(value = "/update/{id}")
    public Object update(@PathVariable Long id,
                         @Validated
                         @RequestBody PmsProductCategoryParam productCategoryParam,
                         BindingResult result) {
        //TODO 修改商品分类
        return new CommonResult().success(null);
    }

    @ApiOperation("分页查询商品分类")
    @GetMapping(value = "/list/{parentId}")
    public Object getList(@PathVariable Long parentId,
                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        //TODO 分页查询商品分类

        return new CommonResult().success(null);
    }

    @ApiOperation("根据id获取商品分类")
    @GetMapping(value = "/{id}")
    public Object getItem(@PathVariable Long id) {
        //TODO 根据id获取商品分类
        return new CommonResult().success(null);
    }

    @ApiOperation("删除商品分类")
    @PostMapping(value = "/delete/{id}")
    public Object delete(@PathVariable Long id) {
        //TODO 删除商品分类
        return new CommonResult().success(null);
    }

    @ApiOperation("修改导航栏显示状态")
    @PostMapping(value = "/update/navStatus")
    public Object updateNavStatus(@RequestParam("ids") List<Long> ids, @RequestParam("navStatus") Integer navStatus) {
        //TODO 修改导航栏显示状态
        return new CommonResult().success(null);
    }

    @ApiOperation("修改显示状态")
    @PostMapping(value = "/update/showStatus")
    public Object updateShowStatus(@RequestParam("ids") List<Long> ids, @RequestParam("showStatus") Integer showStatus) {
        //TODO 修改显示状态
        return new CommonResult().success(null);
    }

    @ApiOperation("查询所有一级分类及子分类[有难度]")
    @GetMapping(value = "/list/withChildren")
    public Object listWithChildren() {
        //TODO 查询所有一级分类及子分类
        List<ProductCategoryWithChildrenItem> productCategoryList = productCategoryService.listWithChildren(0);
        return new CommonResult().success(productCategoryList);
    }
}
