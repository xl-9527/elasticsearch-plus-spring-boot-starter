package com.mine.conf;

import com.mine.core.exec.ElasticsearchTemplateExecutor;
import com.mine.core.exec.IExecutor;
import com.mine.core.exec.RestHighLevelClientExecutor;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
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
    @ConditionalOnMissingBean(IExecutor.class)
    @ConditionalOnBean(ElasticsearchTemplate.class)
    @Configuration(proxyBeanMethods = false)
    public static class EsTemplateAutoConfig {

        @Bean
        public IExecutor executor(ElasticsearchTemplate elasticsearchTemplate) {
            return new ElasticsearchTemplateExecutor(elasticsearchTemplate);
        }
    }

    @ConditionalOnMissingBean(IExecutor.class)
    @ConditionalOnBean(RestHighLevelClient.class)
    @Configuration(proxyBeanMethods = false)
    public static class EsRestHighLevelClientConfig {

        @Bean
        public IExecutor executor(final RestHighLevelClient restHighLevelClient) {
            return new RestHighLevelClientExecutor(restHighLevelClient);
        }
    }
}
