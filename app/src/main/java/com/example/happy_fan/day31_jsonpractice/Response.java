package com.example.happy_fan.day31_jsonpractice;

import java.util.List;

/**
 * Created by apple on 16/4/1.
 */
public class Response {
    private boolean status;
    private long total;
    private List<Cook> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Cook> getTngou() {
        return tngou;
    }

    public void setTngou(List<Cook> tngou) {
        this.tngou = tngou;
    }
}
