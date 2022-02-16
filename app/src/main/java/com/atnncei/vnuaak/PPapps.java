package com.atnncei.vnuaak;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;
import java.util.Objects;

public class PPapps {
    public static String statnnceivnuaak = "";
    public static String KEY_APP_ATNNCEI_VNUAAK = "bmRFUVBwVXI3emZDN3RyWUxWRnN3Yw==";
    public static String ffdIDatnnceivnuaak;
    public static String aaaParamatnnceivnuaak;

    PPapps(AV1 av1) {
        AppsFlyerConversionListener yyatnnceivnuaak = new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                statnnceivnuaak = Objects.requireNonNull(map.get(Dec.DecPoo("YWZfc3RhdHVz"))).toString();
                if (statnnceivnuaak.equals(Dec.DecPoo("Tm9uLW9yZ2FuaWM="))) {
                    String ff = Objects.requireNonNull(map.get(Dec.DecPoo("Y2FtcGFpZ24="))).toString();
                    aaaParamatnnceivnuaak = Pardd.Parser(ff);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        };
        AppsFlyerLib.getInstance().init(Dec.DecPoo(KEY_APP_ATNNCEI_VNUAAK), yyatnnceivnuaak, av1);
        AppsFlyerLib.getInstance().start(av1);
        ffdIDatnnceivnuaak = AppsFlyerLib.getInstance().getAppsFlyerUID(av1);
    }
}
