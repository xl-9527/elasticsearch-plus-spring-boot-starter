package com.mine.exec;

import com.mine.exec.dto.CreateResponseDto;
import com.mine.exec.dto.DeleteResponseDto;
import com.mine.exec.dto.SearchResponseDto;
import com.mine.exec.dto.UpdateResponseDto;

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
