package com.atnncei.vnuaak;

import static com.atnncei.vnuaak.POOP.LINK_GIST;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetRo {
    public static String retroLineatnnceivnuaak;

    RetRo(){
        Retrofit retrofitatnnceivnuaak = new Retrofit.Builder().baseUrl(LINK_GIST).build();
        POOP info = retrofitatnnceivnuaak.create(POOP.class);
        Call<ResponseBody> query = info.getStrU();
        query.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        retroLineatnnceivnuaak = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
