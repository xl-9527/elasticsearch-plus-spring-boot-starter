package com.mine.core.common;

/**
 * @author xl-9527
 * @since 2024/10/12
 **/
public abstract class AbsEsCRUDBuilder<T> {

    public T build() {
        return (T) this;
    }
}
