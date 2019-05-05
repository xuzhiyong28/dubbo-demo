package com.xzy.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xuzhiyong
 * @createDate 2019-05-05-22:22
 */
public class Token implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String token;

    private Integer userId;

    private Date tokenDate;

    private String ip;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTokenDate() {
        return tokenDate;
    }

    public void setTokenDate(Date tokenDate) {
        this.tokenDate = tokenDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
