package com.mine.core.exec.dto;

import java.util.List;

/**
 * @author xl-9527
 * @since 2024/10/19
 **/
public interface SearchResponseDto<T> {

    List<T> hits();
}
