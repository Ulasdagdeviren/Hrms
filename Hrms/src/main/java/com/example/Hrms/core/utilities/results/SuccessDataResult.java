package com.example.Hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{


    public SuccessDataResult(T data, String message, boolean success) {
        super(data, message, true);
    }
    public SuccessDataResult(T data, String message) {
        super(data, message, true);
    }
    public SuccessDataResult(T data) {
        super(data,true);
    }
    public SuccessDataResult(T data, boolean success) {
        super(data, true);
    }
    public SuccessDataResult(){
        super(null,null,true);
    }

    public SuccessDataResult(String message){
        super(null,message,true);
    }

}
