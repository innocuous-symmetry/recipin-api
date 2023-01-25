package com.innocuoussymmetry.recipin.models;

abstract class AppList {
    private Integer id;
    private String name;
    private Integer ownerId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Integer id) {
        this.ownerId = id;
    }
}
