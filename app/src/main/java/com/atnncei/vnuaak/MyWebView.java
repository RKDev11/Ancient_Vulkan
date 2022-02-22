package com.atnncei.vnuaak;

import static com.atnncei.vnuaak.AV1.FILE_ATNNCEI_VNUAAK;
import static com.atnncei.vnuaak.AV1.PHOTO_ATNNCEI_VNUAAK;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;
import java.io.IOException;

public class MyWebView extends WebView {
    public static AV1 av;


    public MyWebView(Context context) {
        super(context);
    }

    public MyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setAppCacheEnabled(true);
        this.getSettings().setDomStorageEnabled(true);
        this.getSettings().setAllowContentAccess(true);
        this.getSettings().setAllowFileAccess(true);
        this.getSettings().setAppCacheEnabled(true);
        this.getSettings().setAllowFileAccessFromFileURLs(true);
        this.getSettings().setSaveFormData(true);
        this.getSettings().setMixedContentMode(0);
        this.getSettings().setSavePassword(true);
        this.getSettings().setAllowContentAccess(true);
        this.getSettings().setLoadsImagesAutomatically(true);
        this.getSettings().setAllowUniversalAccessFromFileURLs(true);
        this.getSettings().setDatabaseEnabled(true);
        this.getSettings().setLoadWithOverviewMode(true);
        this.getSettings().setUseWideViewPort(true);
        this.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.getSettings().setDomStorageEnabled(true);
        this.getSettings().setAllowFileAccess(true);
        this.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.getSettings().setEnableSmoothTransition(true);

        this.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView,
                                             ValueCallback<Uri[]> filePathCallback,
                                             FileChooserParams fileChooserParams) {
                if (FILE_ATNNCEI_VNUAAK != null) {
                    FILE_ATNNCEI_VNUAAK.onReceiveValue(null);
                }
                FILE_ATNNCEI_VNUAAK = filePathCallback;


                Intent intentImage = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (intentImage.resolveActivity(context.getPackageManager()) != null) {
                    File photo = null;
                    try {
                        photo = downloadFile();
                        intentImage.putExtra(Dec.DecPoo("UGhvdG9QYXRo"), PHOTO_ATNNCEI_VNUAAK);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (photo != null) {
                        PHOTO_ATNNCEI_VNUAAK = Dec.DecPoo("ZmlsZTo=") + photo.getAbsolutePath();
                        intentImage.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photo));
                    } else {
                        intentImage = null;
                    }
                }
                Intent intentContentSsetcerOefljgun = new Intent(Intent.ACTION_GET_CONTENT);
                intentContentSsetcerOefljgun.addCategory(Intent.CATEGORY_OPENABLE);
                intentContentSsetcerOefljgun.setType(Dec.DecPoo("aW1hZ2UvKg=="));

                Intent[] arrayIntentSsetcerOefljgun;
                if (intentImage != null) {
                    arrayIntentSsetcerOefljgun = new Intent[]{intentImage};
                } else {
                    arrayIntentSsetcerOefljgun = new Intent[0];
                }
                Intent intentChooserSsetcerOefljgun = new Intent(Intent.ACTION_CHOOSER);
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_INTENT, intentContentSsetcerOefljgun);
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_TITLE, Dec.DecPoo("RmlsZSBDaG9vc2Vy"));
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayIntentSsetcerOefljgun);
                av.startActivityForResult(intentChooserSsetcerOefljgun, 1);
                return true;
            }

            public File downloadFile() throws IOException {
                File imageFileSsetcerOefljgun = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                        Dec.DecPoo("RGlyZWN0b3J5TmFtZUhlcmU="));

                if (imageFileSsetcerOefljgun.exists()) {
                    imageFileSsetcerOefljgun.mkdirs();
                }
                imageFileSsetcerOefljgun = new File(imageFileSsetcerOefljgun + File.separator +
                        Dec.DecPoo("SU1HXw==") + String.valueOf(System.currentTimeMillis()) +
                        Dec.DecPoo("LmpwZw=="));
                return imageFileSsetcerOefljgun;

            }
        });
        this.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(Dec.DecPoo("Z2FwcHM9NDA0"))){
                    Intent intent = new Intent(context, Center.class);
                    av.startActivity(intent);
                    av.finishAffinity();
                }
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                SharedPreferences sss = PreferenceManager.getDefaultSharedPreferences(view.getContext());
                SharedPreferences.Editor ppappa = sss.edit();
                ppappa.putString(Dec.DecPoo("cHBwX2tlZXk="), url);
                ppappa.apply();
            }
        });
    }

}
