package com.xzy.customer.controller;

import com.xzy.model.Token;
import com.xzy.service.TestServiceApi;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2019-05-05-22:46
 */
@Controller
@RequestMapping("/con")
public class MyController {
    @Autowired
    private TestServiceApi testServiceApi;

    @RequestMapping(value = "/test")
    @ResponseBody
    public List<Token> testSay(){
        List<Token> list = testServiceApi.helloWorld();
        System.out.println("list:"+ list);
        System.out.println(JSONArray.fromObject(list));
        return list;
    }

    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    @ResponseBody
    public Token selectById(HttpServletRequest request, HttpServletResponse response){
        Token token = new Token();
        token.setIp("11111");
        return token;
    }
}
