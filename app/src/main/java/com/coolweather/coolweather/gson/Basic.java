package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by macbookpro on 3/22/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
