package com.educfusion.demo.dto;

public class JsonApi {
    private String version;

    public JsonApi(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
