package com.atnncei.vnuaak;

import static com.atnncei.vnuaak.PPapps.KEY_APP_ATNNCEI_VNUAAK;
import static com.atnncei.vnuaak.PPapps.ffdIDatnnceivnuaak;
import static com.atnncei.vnuaak.AV1.BB_ATNNCEI_VNUAAK;

import com.onesignal.OneSignal;

public class Pardd {
    public static String Parser(String oLine) {

        String keyvatnnceivnuaak;
        String ub6atnnceivnuaak;
        String ub7atnnceivnuaak;
        String ub2atnnceivnuaak;
        String ub3atnnceivnuaak;
        String ub4atnnceivnuaak;
        String ub5atnnceivnuaak;
        String[] aLineatnnceivnuaak = oLine.split("::");

        try {
            keyvatnnceivnuaak = aLineatnnceivnuaak[0];
        } catch (NullPointerException e) {
            keyvatnnceivnuaak = "";
        }
        try {
            ub6atnnceivnuaak = aLineatnnceivnuaak[1];
        } catch (NullPointerException e) {
            ub6atnnceivnuaak = "";
        }
        try {
            ub7atnnceivnuaak = aLineatnnceivnuaak[2];
        } catch (NullPointerException e) {
            ub7atnnceivnuaak = "";
        }
        try {
            ub2atnnceivnuaak = aLineatnnceivnuaak[3];
        } catch (NullPointerException e) {
            ub2atnnceivnuaak = "";
        }
        try {
            ub3atnnceivnuaak = aLineatnnceivnuaak[4];
        } catch (NullPointerException e) {
            ub3atnnceivnuaak = "";
        }
        try {
            ub4atnnceivnuaak = aLineatnnceivnuaak[5];
        } catch (NullPointerException e) {
            ub4atnnceivnuaak = "";
        }
        try {
            ub5atnnceivnuaak = aLineatnnceivnuaak[6];
        } catch (NullPointerException e) {
            ub5atnnceivnuaak = "";
        }

        OneSignal.sendTag(Dec.DecPoo("c3ViX2FwcA=="), ub6atnnceivnuaak);
        String pspllpo = (keyvatnnceivnuaak + Dec.DecPoo("P2J1bmRsZT0=") + (BuildConfig.APPLICATION_ID)
                + Dec.DecPoo("JmFkX2lkPQ==") + BB_ATNNCEI_VNUAAK + Dec.DecPoo("JmFwcHNfaWQ9") + ffdIDatnnceivnuaak +
                Dec.DecPoo("JmRldl9rZXk9") + Dec.DecPoo(KEY_APP_ATNNCEI_VNUAAK) +
                Dec.DecPoo("JnN1YjY9") + ub6atnnceivnuaak +
                Dec.DecPoo("JnN1Yjc9") + ub7atnnceivnuaak +
                Dec.DecPoo("JnN1YjI9") + ub2atnnceivnuaak +
                Dec.DecPoo("JnN1YjM9") + ub3atnnceivnuaak +
                Dec.DecPoo("JnN1YjQ9") + ub4atnnceivnuaak +
                Dec.DecPoo("JnN1YjU9") + ub5atnnceivnuaak);
        return pspllpo;
    }
}
