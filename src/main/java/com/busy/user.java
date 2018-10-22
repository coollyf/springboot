package com.busy;

import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by acer on 2018/5/30.
 */
@Entity
public class user {
    private String userName;
    private int age;
    @Id
    @GeneratedValue
    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public user(){

    }
    public user(String username, int age){
        this.userName = username;
        this.age = age;

    }
}
