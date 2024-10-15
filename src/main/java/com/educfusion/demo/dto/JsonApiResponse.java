package com.educfusion.demo.dto;

import java.util.List;

public class JsonApiResponse<T> {
    private JsonApi jsonapi;
    private List<JsonApiData<T>> data;
    private Links links;
    private Meta meta;

    public JsonApiResponse(JsonApi jsonapi, List<JsonApiData<T>> data, Links links, Meta meta) {
        this.jsonapi = jsonapi;
        this.data = data;
        this.links = links;
        this.meta = meta;
    }

    public JsonApi getJsonapi() {
        return jsonapi;
    }

    public void setJsonapi(JsonApi jsonapi) {
        this.jsonapi = jsonapi;
    }

    public List<JsonApiData<T>> getData() {
        return data;
    }

    public void setData(List<JsonApiData<T>> data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
