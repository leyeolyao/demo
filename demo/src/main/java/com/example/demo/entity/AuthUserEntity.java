package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auth_user", schema = "mytest")
public class AuthUserEntity {
    private Long id;
    private String account;
    private String name;
    private String pwd;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthUserEntity that = (AuthUserEntity) o;
        return id == that.id &&
                Objects.equals(account, that.account) &&
                Objects.equals(name, that.name) &&
                Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, name, pwd);
    }
}
