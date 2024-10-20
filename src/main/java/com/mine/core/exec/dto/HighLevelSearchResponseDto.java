package com.mine.core.exec.dto;

import org.elasticsearch.action.search.SearchResponse;

import java.util.List;

/**
 * @author xl-9527
 * @since 2024/10/12
 **/
public class HighLevelSearchResponseDto<T> implements SearchResponseDto<T> {

    /**
     * HighLevelSearchResponse
     */
    public HighLevelSearchResponseDto(final SearchResponse search) {

    }


    @Override
    public List<T> hits() {
        return null;
    }
}
