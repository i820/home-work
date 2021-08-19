package com.sbrf.reboot.service;

import lombok.Data;

@Data
public class Account {
    private String accountId;
    private String accountName;
    private long clientId;

    public Account(String accountId) {
        this.accountId = accountId;
    }
}
