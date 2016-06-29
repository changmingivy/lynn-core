package com.mobanker.framework.dto;


import lombok.ToString;

import java.io.Serializable;

@ToString(callSuper = true)
public class ResponseTentity<T> implements Serializable {
    private static final long serialVersionUID = -720807478055084231L;

    private String status;
    private String error;
    private String msg;
    private T data;
    private String pageCount;

    public ResponseTentity(){

    }

    public ResponseTentity(String status){
        this.status = status;
    }

    public ResponseTentity(String status, String error){
        this.status = status;
        this.error = error;
    }

    public ResponseTentity(String status, T data){
        this.status = status;
        this.data = data;
    }

    public ResponseTentity(String status, T data,String pageCount){
        this.status = status;
        this.data = data;
        this.pageCount = pageCount;
    }

    public ResponseTentity(String status, String error, String msg, T data){
        this.status = status;
        this.error = error;
        this.msg = msg;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public ResponseTentity setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getError() {
        return error;
    }

    public ResponseTentity setError(String error) {
        this.error = error;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseTentity setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseTentity setData(T data) {
        this.data = data;
        return this;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

}
