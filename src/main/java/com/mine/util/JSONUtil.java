package com.mine.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xl-9527
 * @since 2024/10/15
 **/
public class JSONUtil {

    private static final Logger log = LoggerFactory.getLogger(JSONUtil.class);

    public final static ObjectMapper objectMapper = new ObjectMapper();

    public static String toJsonString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
