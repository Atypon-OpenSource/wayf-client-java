package com.atypon.wayf.data.device;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Device {

    @JsonProperty("globalId")
    private String globalId;

    @JsonProperty("globalId")
    public String getGlobalId() {
        return globalId;
    }

    @JsonProperty("globalId")
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }
}
