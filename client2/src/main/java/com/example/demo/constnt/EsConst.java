package com.example.demo.constnt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author @醉鱼
 * @link https://github.com/TianPuJun
 * @ClassName EsConst
 * @Description
 * @Date 21:10 2022/4/7
 **/
@Configuration
public class EsConst {
    @Value("${spring.data.elasticsearch.client.namespace}")
    private String elasticsearchNamespace;
    @Bean
    public String getElasticsearchNamespace(){
        return elasticsearchNamespace;
    }
}
