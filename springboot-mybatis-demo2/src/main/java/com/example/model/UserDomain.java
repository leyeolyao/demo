package com.example.model;

public class UserDomain {
    private Integer userId;

    private String userName;

    private String password;

    private String name;

    private String emailaddress;

    private String phone;

    private String status;

    private String loginerrortimes;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoginerrortimes() {
        return loginerrortimes;
    }

    public void setLoginerrortimes(String loginerrortimes) {
        this.loginerrortimes = loginerrortimes;
    }
}
