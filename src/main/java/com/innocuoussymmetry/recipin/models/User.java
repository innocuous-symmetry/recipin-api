package com.innocuoussymmetry.recipin.models;

import javax.persistence.*;

@Entity
public class User extends DBEntity {
    @Column(name="firstname")
    private String firstName;
    private String lastName;
    private String handle;
    private String email;
    private boolean isAdmin;
    private String password;
}