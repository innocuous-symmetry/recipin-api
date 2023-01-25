package com.innocuoussymmetry.recipin.models;

import jakarta.persistence.*;

@Entity
@Table(name="friendships")
public class Friendship {
    @Id
    @Column(name="name")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="senderid")
    private Integer senderId;
    @Column(name="targetid")
    private Integer targetId;
    @Column(name="pending")

    private boolean pending;

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public boolean getPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }
}