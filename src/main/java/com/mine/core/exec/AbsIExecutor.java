package com.mine.core.exec;

import com.mine.core.exec.dto.*;
import com.mine.exception.NonsupportException;

/**
 * @author xl-9527
 * @since 2024/10/19
 **/
public abstract class AbsIExecutor implements IExecutor {

    @Override
    public UpdateResponseDto update() {
        throw new NonsupportException("nonsupport opc");
    }

    @Override
    public CreateResponseDto create() {
        throw new NonsupportException("nonsupport opc");
    }

    @Override
    public DeleteResponseDto delete() {
        throw new NonsupportException("nonsupport opc");
    }

    @Override
    public SqlResponseDto _sql() {
        throw new NonsupportException("nonsupport opc");
    }

    @Override
    public NodesResponseDto _nodes() {
        throw new NonsupportException("nonsupport opc");
    }
}
