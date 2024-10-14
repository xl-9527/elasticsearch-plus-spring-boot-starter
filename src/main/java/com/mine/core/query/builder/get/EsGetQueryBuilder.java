package com.mine.core.query.builder.get;

import com.mine.core.common.AbsEsCRUDBuilder;

/**
 * @author xl-9527
 * @since 2024/10/12
 **/
public class EsGetQueryBuilder extends AbsEsCRUDBuilder<EsGetQueryBuilder> {

    private final String indexName;

    public EsGetQueryBuilder(final String indexName) {
        this.indexName = indexName;
    }

    public EsSearchQueryBuilder search() {
        return new EsSearchQueryBuilder(indexName);
    }
}
