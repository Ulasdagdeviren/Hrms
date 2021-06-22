package com.example.Hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{


    public ErrorDataResult(T data, String message, boolean success) {
        super(data, message, false);
    }
    public ErrorDataResult(String... messages)
    {
        super(messages,false);
    }
    public ErrorDataResult(T data, boolean success) {
        super(data, false);
    }


    public ErrorDataResult(){

        super(null,null,false);
    }

    public ErrorDataResult(String message){

        super(null,message,false);
    }

}
