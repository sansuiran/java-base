package com.rank.base.validate;

public class FenceStyle {

    public void validate(String param1, String param2, String param3) {
        if (param1 != null && !param1.equals("")) {
            if (param2 != null && !param2.equals("")) {
                if (param3 != null && !param3.equals("")) {

                    // actual method code goes here.

                } else {
                    // some logging here
                }
            } else {
                // some logging here
            }
        } else {
            // some logging here
        }
    }

    public void validateOptimization(String param1, String param2, String param3) {

        if (param1 == null || param1.equals("")) {
            // some logging here

        } else if (param2 == null || param2.equals("")) {
            // some logging here

        } else if (param3 == null || param3.equals("")) {
            // some logging here

        } else {

            // actual method code goes here.

        }

    }


}
