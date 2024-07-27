package com.example.viewpagerexercise;

import com.google.gson.annotations.SerializedName;

public class CountPOJO {

    @SerializedName("total_count")
    int totalCount;

    @SerializedName("interaction_count")
    int interactionCount;

    public CountPOJO(int totalCount, int interactionCount) {
        this.totalCount = totalCount;
        this.interactionCount = interactionCount;
    }

    public int getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(int interactionCount) {
        this.interactionCount = interactionCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
