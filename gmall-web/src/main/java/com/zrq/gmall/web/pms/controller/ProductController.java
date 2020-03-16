package com.zrq.gmall.web.pms.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zrq.gmall.api.to.CommonResult;
import com.zrq.gmall.api.vo.PageInfo;
import com.zrq.gmall.api.vo.product.PmsProductParam;
import com.zrq.gmall.api.vo.product.PmsProductQueryParam;
import com.zrq.gmall.api.pms.entity.Product;
import com.zrq.gmall.api.pms.service.ProductService;
import com.zrq.gmall.web.exception.GmallException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 商品管理Controller
 */
@RestController
@Api(tags = "商品管理")
@RequestMapping("/product")
@CrossOrigin
@Slf4j
public class ProductController {
    @Reference
    private ProductService productService;

    @ApiOperation("创建商品")
    @PostMapping(value = "/create")
    public Object create(@RequestBody PmsProductParam productParam,
                         BindingResult bindingResult) {
        //TODO 查询所有一级分类及子分类
        return new CommonResult().success(null);
    }

    @ApiOperation("根据商品id获取商品编辑信息")
    @GetMapping(value = "/updateInfo/{id}")
    public Object getUpdateInfo(@PathVariable Long id) {
        //TODO 根据商品id获取商品编辑信息
        return new CommonResult().success(null);
    }

    @ApiOperation("更新商品")
    @PostMapping(value = "/update/{id}")
    public Object update(@PathVariable Long id, @RequestBody PmsProductParam productParam, BindingResult bindingResult) {
        //TODO 更新商品
        return new CommonResult().success(null);
    }

    @ApiOperation("查询商品")
    @GetMapping(value = "/list")
    public Object getList(@Valid PmsProductQueryParam productQueryParam,
                          BindingResult bindingResult,
                          @RequestParam(value = "pageSize", defaultValue = "5") Long pageSize,
                          @RequestParam(value = "pageNum", defaultValue = "1") Long pageNum) {
        //TODO 查询商品
        Page<Product> productPage = new Page<>(pageNum, pageSize);
        PageInfo<Product> productPageInfo = productService.listProduct(productPage, productQueryParam);
        return new CommonResult().success(productPageInfo);
    }

    @ApiOperation("根据商品名称或货号模糊查询")
    @GetMapping(value = "/simpleList")
    public Object getList(String  keyword) {
        //TODO 根据商品名称或货号模糊查询
        return new CommonResult().success(null);
    }

    @ApiOperation("批量修改审核状态")
    @PostMapping(value = "/update/verifyStatus")
    public Object updateVerifyStatus(@RequestParam("ids") List<Long> ids,
                                     @RequestParam("verifyStatus") Integer verifyStatus,
                                     @RequestParam("detail") String detail) {
        //TODO 批量修改审核状态
        return new CommonResult().success(null);
    }

    @ApiOperation("批量上下架")
    @PostMapping(value = "/update/publishStatus")
    public Object updatePublishStatus(@RequestParam("ids") List<Long> ids,
                                     @RequestParam("publishStatus") Integer publishStatus) {
        //TODO 批量上下架
        return new CommonResult().success(null);
    }

    @ApiOperation("批量推荐商品")
    @PostMapping(value = "/update/recommendStatus")
    public Object updateRecommendStatus(@RequestParam("ids") List<Long> ids,
                                      @RequestParam("recommendStatus") Integer recommendStatus) {
        //TODO 批量推荐商品
        return new CommonResult().success(null);
    }

    @ApiOperation("批量设为新品")
    @PostMapping(value = "/update/newStatus")
    public Object updateNewStatus(@RequestParam("ids") List<Long> ids,
                                        @RequestParam("newStatus") Integer newStatus) {
        //TODO 批量设为新品
        return new CommonResult().success(null);
    }

    @ApiOperation("批量修改删除状态")
    @PostMapping(value = "/update/deleteStatus")
    public Object updateDeleteStatus(@RequestParam("ids") List<Long> ids,
                                  @RequestParam("deleteStatus") Integer deleteStatus) {
        //TODO 根据商品id获取商品编辑信息
        return new CommonResult().success(null);
    }
}
