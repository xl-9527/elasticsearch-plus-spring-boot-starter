package com.mine.core.query;

import com.mine.core.query.builder.get.EsGetQueryBuilder;
import com.mine.core.query.builder.get.EsSearchQueryBuilder;

/**
 * @author xl-9527
 * @since 2024/10/12
 **/
public class ESQueryBuilder {

    public static ESQueryBuilder builder() {
        return new ESQueryBuilder();
    }

    public EsSearchQueryBuilder search(final String indexName) {
        return new EsSearchQueryBuilder(indexName);
    }

    public EsGetQueryBuilder get(final String indexName) {
        return new EsGetQueryBuilder(indexName);
    }
}
