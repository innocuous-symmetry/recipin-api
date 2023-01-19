package com.innocuoussymmetry.recipin.models;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="friendships")
public class Friendship extends DBEntity {
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