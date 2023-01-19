package com.innocuoussymmetry.recipin.models;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="grocerylist")
class GroceryList extends AppList {
    @Column(name="name")
    private String name;
    @Column(name="ownerid")
    private Integer ownerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}