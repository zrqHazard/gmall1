package com.zrq.gmall.web.pms.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zrq.gmall.api.to.CommonResult;
import com.zrq.gmall.api.pms.entity.SkuStock;
import com.zrq.gmall.api.pms.service.SkuStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * sku库存Controller
 */
@RestController
@Api(tags = "PmsSkuStockController", description = "sku商品库存管理")
@RequestMapping("/sku")
public class PmsSkuStockController {
    @Reference
    private SkuStockService skuStockService;

    @ApiOperation("根据商品编号及编号模糊搜索sku库存")
    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(@PathVariable Long pid, @RequestParam(value = "keyword",required = false) String keyword) {

        //TODO 根据商品编号及编号模糊搜索sku库存
        return new CommonResult().success(null);
    }
    @ApiOperation("批量更新库存信息")
    @RequestMapping(value ="/update/{pid}",method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Long pid,@RequestBody List<SkuStock> skuStockList){

        //TODO 批量更新库存信息
        return new CommonResult().success(null);
    }
}
