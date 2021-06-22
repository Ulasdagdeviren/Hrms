package com.example.Hrms.core.utilities.results;

public class ErrorResult extends Result{
    public ErrorResult() {
        super(false);
    }

    public ErrorResult(String message) {
        super(message, true);
    }
    public ErrorResult(String... message){
        super(message,false);
    }


}
