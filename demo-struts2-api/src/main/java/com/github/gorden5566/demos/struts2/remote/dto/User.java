package com.github.gorden5566.demos.struts2.remote.dto;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -2352567605284222075L;
    private Long id;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
