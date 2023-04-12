package com.example.demo.models;

import javax.persistence.Embeddable;

@Embeddable
public class userPhone {

    private Long number;
    private int citycode;
    private int contrycode;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public int getContrycode() {
        return contrycode;
    }

    public void setContrycode(int contrycode) {
        this.contrycode = contrycode;
    }
}