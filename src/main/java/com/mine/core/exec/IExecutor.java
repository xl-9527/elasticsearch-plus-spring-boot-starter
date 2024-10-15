package com.mine.core.exec;

import com.mine.core.exec.dto.CreateResponseDto;
import com.mine.core.exec.dto.DeleteResponseDto;
import com.mine.core.exec.dto.SearchResponseDto;
import com.mine.core.exec.dto.UpdateResponseDto;

/**
 * @author xl-9527
 * @since 2024/10/11
 **/
public interface IExecutor {

    SearchResponseDto search();

    UpdateResponseDto update();

    CreateResponseDto create();

    DeleteResponseDto delete();
}
