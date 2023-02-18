package com.common.config;

import com.common.data.SecretsData;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * MyBatis配置类
 * @author Sophiee
 */
@Configuration
@MapperScan("com.secretsmanager.mapper")
public class MyBatisConfig {

    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;
    @Value("${cloud.aws.credentials.secret-key}")
    private String secretKey;

    @Autowired
    SecretsManagerConfig secretsManagerConfig;

    /**
     * DataSource注入
     * @return dataSource 数据源
     */
    @Bean
    public DataSource dataSource() {
        String secretName = "mysecret1";
        String region = "ap-northeast-1";
        SecretsData secrets = secretsManagerConfig.getSecret(accessKey,secretKey,secretName,region);
        DataSource dataSource = DataSourceBuilder
                .create()
                //.driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:" + secrets.getEngine() + "://" + secrets.getHost() + ":" + secrets.getPort())
                .username(secrets.getUsername())
                .password(secrets.getPassword())
                .build();
        return dataSource;
    }
}

