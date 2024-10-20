package com.mine.core.exec;

import com.mine.core.exec.dto.SearchResponseDto;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;

/**
 * @author xl-9527
 * @since 2024/10/19
 **/
public class ElasticsearchTemplateExecutor extends AbsIExecutor {

    private final ElasticsearchTemplate elasticsearchTemplate;

    public ElasticsearchTemplateExecutor(final ElasticsearchTemplate elasticsearchTemplate) {
        this.elasticsearchTemplate = elasticsearchTemplate;
    }

    @Override
    public SearchResponseDto search() {
        return null;
    }
}
