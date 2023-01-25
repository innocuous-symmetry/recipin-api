package com.innocuoussymmetry.recipin.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Map;

@Entity
@Table(name="appusers")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="handle")
    private String handle;

    @Column(name="email")
    private String email;

    @Column(name="isadmin")
    private Boolean isadmin;

    @Column(name="password")
    private String password;

    @Column(name="active")
    private Boolean active;

    @Column(name="datecreated")
    private Date datecreated;

    @Column(name="datemodified")
    private Date datemodified;

    public User() {
        this.datecreated = new Date();
        this.datemodified = new Date();
    }

    public User(Map<String, String> user) {
        this.firstname = user.get("firstname");
        this.lastname = user.get("lastname");
        this.email = user.get("email");
        this.handle = user.get("handle");
        this.isadmin = Boolean.getBoolean(user.get("isadmin"));
        this.password = user.get("password");
        this.active = Boolean.getBoolean(user.get("active"));
        this.datecreated = (user.get("datecreated") != null) ? new Date(user.get("datecreated")) : new Date();
        this.datemodified = (user.get("datemodified") != null) ? new Date(user.get("datemodified")) : new Date();
    }

    public User(String firstname, String lastname, String email, String handle, Boolean isadmin, String password, Boolean active) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.handle = handle;
        this.isadmin = isadmin;
        this.password = password;
        this.active = active;
        this.datecreated = new Date();
        this.datemodified = new Date();
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String name) {
        this.firstname = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String name) {
        this.lastname = name;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsActive() { return active; }

    public void setIsActive(boolean active) { this.active = active; }

    public boolean getIsAdmin() {
        return isadmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isadmin = isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(Date datemodified) {
        this.datemodified = datemodified;
    }

    @Override
    public String toString() {
        return "Email: " + this.email + " firstname: " + this.firstname + " lastname: " + this.lastname + " handle: " + this.handle + " password: " + this.password;
    }
}