package com.caizenghui.retrofitcase.net;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by caizenghui on 16/5/25.
 */
public interface HttpService {

    @GET("/cc/json/mobile_tel_segment.htm")
    Call<PhoneInfo> getPhoneInfo(@Query("tel") String tel);@GET("/cc/json/mobile_tel_segment.htm")
    Observable<PhoneInfo> loadPhoneInfo(@Query("tel") String tel);



}
