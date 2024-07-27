package com.example.viewpagerexercise;

import com.google.gson.annotations.SerializedName;

public class Count {
    @SerializedName(value = "exam",alternate = {"handson","assignment","interaction"})
    CountPOJO countPOJO;

    public Count(CountPOJO countPOJO) {
        this.countPOJO = countPOJO;
    }

    public CountPOJO getCountPOJO() {
        return countPOJO;
    }

    public void setCountPOJO(CountPOJO countPOJO) {
        this.countPOJO = countPOJO;
    }
}
