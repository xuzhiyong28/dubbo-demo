package com.xzy.service;

import com.xzy.model.Token;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2019-05-05-22:23
 */
public interface TestServiceApi {
    public List<Token> helloWorld();
    public Token selectById(String token);
}
