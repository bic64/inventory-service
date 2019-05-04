package com.bic64.inventoryservice.domain;

public class GreetingResponse {

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer count;
    private String name;

}
