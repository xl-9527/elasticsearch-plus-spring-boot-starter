package com.mine.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;

/**
 * @author xl-9527
 * @since 2024/10/11
 **/
@Configuration(proxyBeanMethods = false)
public class ElasticSearchPlusAutoConfig {

    /**
     * elastic search of boot elasticsearchTemplate bean is exist
     */
    @ConditionalOnBean(ElasticsearchTemplate.class)
    @Configuration(proxyBeanMethods = false)
    public static class EsTemplateAutoConfig {

    }
}
