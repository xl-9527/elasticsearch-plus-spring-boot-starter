package com.mine.core.exec;

import com.mine.core.exec.dto.*;

import java.io.IOException;

/**
 * @author xl-9527
 * @since 2024/10/11
 **/
public interface IExecutor {

    <T> SearchResponseDto<T> search(SearchDto<T> searchDto) throws IOException;

    UpdateResponseDto update();

    CreateResponseDto create();

    DeleteResponseDto delete();

    SqlResponseDto _sql();

    NodesResponseDto _nodes();
}
