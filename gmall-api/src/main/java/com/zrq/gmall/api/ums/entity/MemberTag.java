package com.zrq.gmall.api.ums.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 用户标签表
 * </p>
 *
 * @author zrq
 * @since 2020-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_member_tag")
@ApiModel(value="MemberTag对象", description="用户标签表")
public class MemberTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "自动打标签完成订单数量")
    @TableField("finish_order_count")
    private Integer finishOrderCount;

    @ApiModelProperty(value = "自动打标签完成订单金额")
    @TableField("finish_order_amount")
    private BigDecimal finishOrderAmount;


}
