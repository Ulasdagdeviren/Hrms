package com.example.Hrms.core.utilities.results;

public class Result {

    private String message;
    private String[] messages;
    private boolean success;

    public Result(boolean success){
        this.success=success;
    }

    public Result(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
    public Result(String[] messages, boolean success){
        this.messages=messages;
        this.success=success;
    }


    public String getMessage()
    {
        return message;
    }

    public boolean isSuccess() {

        return success;
    }

    public String[] getMessages() {
        return messages;
    }


}
