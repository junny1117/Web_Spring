package com.example.project.common;

import java.util.UUID;

public class CommonUtils {
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
