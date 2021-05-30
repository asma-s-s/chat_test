package com.ex.mychatapp_master.Fragments;

import com.ex.mychatapp_master.Notifications.MyResponse;
import com.ex.mychatapp_master.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA0pItJ9M:APA91bHpS732vVovxRxClIJuu0SYsDUcBaKXCGL78wVSosWYVJHoZ1Wd5-BwWhTEfBjiii0ZEQVGvibkzAGxr8LN8CdZsGUjvVZBddc_JEa3390Jzgk6AB5ZsC9JNXWh6p0jM4XFiSxE"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
