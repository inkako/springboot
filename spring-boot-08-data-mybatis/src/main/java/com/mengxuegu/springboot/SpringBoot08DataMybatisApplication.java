package com.mengxuegu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//会自动 装配指定包下面所有Mapper，省得在每个Mapper上面写@Mapper
@MapperScan("com.mengxuegu.springboot.mapper")
@SpringBootApplication
public class SpringBoot08DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot08DataMybatisApplication.class, args);
    }
}
