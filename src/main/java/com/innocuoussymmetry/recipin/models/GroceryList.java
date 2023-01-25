package com.innocuoussymmetry.recipin.models;

import jakarta.persistence.*;

@Entity
@Table(name="grocerylist")
class GroceryList extends AppList {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="ownerid")
    private Integer ownerId;
}