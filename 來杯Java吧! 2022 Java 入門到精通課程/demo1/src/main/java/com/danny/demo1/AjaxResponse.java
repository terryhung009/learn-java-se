package com.danny.demo1;

import lombok.Data;

@Data
public class AjaxResponse {

    private boolean isOk;
    private int code;
    private String message;
    private Object data;

    public AjaxResponse(){

    }

    public static AjaxResponse success(Object obj, String message){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("成功");

        return ajaxResponse;
    }

}
