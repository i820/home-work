package com.sbrf.reboot.dto;

import lombok.Data;

@Data
public class Account {
    private long clientId;
    private String number;

    public Account(String number) {
        this.number = number;
    }
    public Account(long clientId, String number) {
        this.clientId = clientId;
        this.number = number;
    }
}
