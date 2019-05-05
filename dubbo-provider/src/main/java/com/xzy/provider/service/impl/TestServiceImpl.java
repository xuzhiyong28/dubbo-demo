package com.xzy.provider.service.impl;

import com.xzy.model.Token;
import com.xzy.service.TestServiceApi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2019-05-05-22:32
 */
@Service
public class TestServiceImpl implements TestServiceApi {
    public List<Token> helloWorld() {
        List<Token> list = new ArrayList<Token>();
        Token token = new Token();
        token.setUserId(1);
        token.setIp("127.0.0.1");
        token.setToken("token");
        token.setTokenDate(new Date());
        list.add(token);
        return list;
    }

    public Token selectById(String token) {
        return null;
    }
}
