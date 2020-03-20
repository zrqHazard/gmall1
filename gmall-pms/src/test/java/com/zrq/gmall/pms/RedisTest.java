package com.zrq.gmall.pms;


import com.zrq.gmall.api.constant.SystemConstant;
import com.zrq.gmall.api.vo.product.ProductCategoryWithChildrenItem;
import com.zrq.gmall.pms.mapper.ProductCategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate StringRedisTemplate;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void test1() {
        List<ProductCategoryWithChildrenItem> productCategoryList = productCategoryMapper.listWithChildren(1);

        redisTemplate.opsForValue().set(SystemConstant.PRODUCT_CATEGORY,productCategoryList);
    }

}
