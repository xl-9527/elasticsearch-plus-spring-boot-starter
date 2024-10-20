package com.mine.core.exec;

import com.mine.core.exec.dto.SearchDto;
import com.mine.core.exec.dto.HighLevelSearchResponseDto;
import com.mine.core.exec.dto.SqlResponseDto;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author xl-9527
 * @since 2024/10/19
 **/
public class RestHighLevelClientExecutor extends AbsIExecutor {

    private final RestHighLevelClient restHighLevelClient;

    public RestHighLevelClientExecutor(final RestHighLevelClient restHighLevelClient) {
        this.restHighLevelClient = restHighLevelClient;
    }

    @Override
    public <T> HighLevelSearchResponseDto<T> search(final SearchDto<T> searchDto) throws IOException {
        SearchResponse search = restHighLevelClient.search(
                new SearchRequest(), RequestOptions.DEFAULT
        );

        if (search.isTimedOut()) {
            throw new TimeoutException()
        }

        return new HighLevelSearchResponseDto<>(search);
    }

    @Override
    public SqlResponseDto _sql() {
        return super._sql();
    }
}
