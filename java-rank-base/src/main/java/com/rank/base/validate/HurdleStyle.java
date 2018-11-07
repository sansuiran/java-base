package com.rank.base.validate;

public class HurdleStyle {

    public void validate(String param1, String param2, String param3) {
        if (param1 == null || param1.equals("")) {
            // some logging if necessary
            return; // or throw some Exception or change to a default value
        }

        if (param2 == null || param2.equals("")) {
            // I'll leave the comments out
            return;
        }

        if (param3 == null || param3.equals("")) {
            return;
        }

        // actual method code goes here.
    }

}
