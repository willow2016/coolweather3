package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by macbookpro on 3/22/17.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
