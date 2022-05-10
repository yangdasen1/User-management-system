/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huawei.productsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * 启动类
 *
 * @since 2021-08-11
 */
@EnableScheduling
@EnableOpenApi
@EnableConfigurationProperties
@SpringBootApplication
public class ProductsupportApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductsupportApplication.class, args);
    }
}
