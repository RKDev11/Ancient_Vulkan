package com.atnncei.vnuaak;

import android.util.Base64;

public class Dec {

     public static String DecPoo(String asd){
        String poi = new String(android.util.Base64.decode(asd, Base64.DEFAULT));
        return poi;
    }
}
