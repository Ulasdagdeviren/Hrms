package com.example.Hrms.core.utilities.Verify;

public class ControlVerify {
    public static boolean Verify(boolean... control){
        for (boolean entity:control) {
            if (entity){
                return true;
            }
        }
        return false;
    }
}
