package com.atnncei.vnuaak;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface POOP {
    public static String LINK_GIST = "https://gist.githubusercontent.com/RKDev11/609d77d92c066c6402c9a537a8be6a9d/raw/Ancient%2520Vulkan/";

    @GET(LINK_GIST)
    Call<ResponseBody> getStrU();
}
