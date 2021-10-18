package com.company.Lesson05_ClassWork;

import java.util.Date;

public class StaticInit {
    static  int field = 30;
    private static String str;
    private static Date dateField;
    private static final String STRING_CONST;

    static {
        field = 50;
        str = getEmptyString();
        dateField = new Date();
        STRING_CONST = "unknown";
    }

    private static String getEmptyString() {
        return "empty";
    }

}
