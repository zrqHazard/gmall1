package com.zrq.gmall.api.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel("分页数据展示")
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo<T> implements Serializable {

    @ApiModelProperty("总记录数")
    private Long total;

    @ApiModelProperty("总页码数")
    private Long totalPage;

    @ApiModelProperty("当前页码")
    private Long pageNum;

    @ApiModelProperty("每页记录数")
    private Long pageSize;

    @ApiModelProperty("查询出记录数据")
    private List<T> list = new ArrayList<>();

}
