package com.zrq.gmall.web;


import com.zrq.gmall.web.exception.GmallException;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void test1() {
        GmallException gmallException = new GmallException("这是我的测试方法");
        System.out.println(gmallException.getMessage());
    }
}
