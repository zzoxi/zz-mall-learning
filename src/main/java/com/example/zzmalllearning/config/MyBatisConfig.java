package com.example.zzmalllearning.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * 创建于2022/9/16
 */
@Configuration
@MapperScan("com/example/zzmalllearning/mbg/mapper")
public class MyBatisConfig {
}
