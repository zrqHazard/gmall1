package com.zrq.gmall.ums;

import com.zrq.gmall.api.ums.entity.Admin;
import com.zrq.gmall.api.ums.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.LinkedList;

@SpringBootTest
public class GmallUmsApplicationTests {

    @Autowired
    AdminService adminService;

    @Test
    public void test1() {
        Admin admin = adminService.getById(4);
        System.out.println(admin);
        System.out.println("hhhhh");
    }

}
