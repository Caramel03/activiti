package com.lele.activiti.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author: mimi
 * @since: 2018/3/22
 */
@Component
public class DBUtil {
    @Bean(value = "datasource")
    @ConfigurationProperties(prefix = "druid.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
