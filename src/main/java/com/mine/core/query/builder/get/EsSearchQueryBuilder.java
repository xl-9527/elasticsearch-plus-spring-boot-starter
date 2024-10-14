package com.mine.core.query.builder.get;

import com.mine.core.common.AbsEsCRUDBuilder;
import com.mine.core.query.builder.query.EsQueryBuilder;

/**
 * @author xl-9527
 * @since 2024/10/12
 **/
public class EsSearchQueryBuilder extends AbsEsCRUDBuilder<EsSearchQueryBuilder> {

    private final String indexName;

    public EsSearchQueryBuilder(final String indexName) {
        this.indexName = indexName;
    }

    public EsQueryBuilder query() {
        return new EsQueryBuilder();
    }

    public EsSearchQueryBuilder _source(final String source) {
        return this;
    }

    public EsSearchQueryBuilder _source(final String[] source) {
        return this;
    }
}
