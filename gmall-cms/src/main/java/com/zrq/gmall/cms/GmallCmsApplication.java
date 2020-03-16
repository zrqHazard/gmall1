package com.zrq.gmall.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zrq.gmall.cms.mapper")
public class GmallCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCmsApplication.class, args);
    }

}
