package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_user", schema = "mytest", catalog = "")
public class TUserEntity {
    private int userId;
    private String userName;
    private String password;
    private String phone;

    @Id
    @Column(name = "userId")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUserEntity that = (TUserEntity) o;
        return userId == that.userId &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password, phone);
    }
}
