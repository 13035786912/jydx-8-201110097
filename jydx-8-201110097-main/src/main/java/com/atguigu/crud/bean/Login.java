package com.atguigu.crud.bean;

public class Login {
    private Integer logId;

    private String logAccount;

    private String logPassword;

    public Login(Integer logId, String logAccount, String logPassword) {
        this.logId = logId;
        this.logAccount = logAccount;
        this.logPassword = logPassword;
    }

    public Login() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogAccount() {
        return logAccount;
    }

    public void setLogAccount(String logAccount) {
        this.logAccount = logAccount == null ? null : logAccount.trim();
    }

    public String getLogPassword() {
        return logPassword;
    }

    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword == null ? null : logPassword.trim();
    }
}