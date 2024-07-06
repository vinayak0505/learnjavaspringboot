package com.lazyengineer.sprintmvcboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    
    public Alien(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public Alien() {
    }
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + "]";
    }

    
}
