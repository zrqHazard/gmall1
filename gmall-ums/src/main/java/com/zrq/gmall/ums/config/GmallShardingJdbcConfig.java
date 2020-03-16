package com.zrq.gmall.ums.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@SpringBootConfiguration
public class GmallShardingJdbcConfig {
    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        //使用sharding-jdbc创建出具有主从库的数据源
        DataSource dataSource = MasterSlaveDataSourceFactory
                .createDataSource(ResourceUtils.getFile("classpath:sharding.yml"));
        return  dataSource;
    }

}
