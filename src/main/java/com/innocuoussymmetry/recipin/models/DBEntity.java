package com.innocuoussymmetry.recipin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
abstract class DBEntity {
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
}
