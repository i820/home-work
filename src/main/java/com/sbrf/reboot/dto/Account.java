package com.sbrf.reboot.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;

@Data
public class Account {
    private long id;
    private String accountId;
    private String accountName;
    private long clientId;
    private BigDecimal balance;
    private LocalDate createDate;

    private Account() {

    }

    public static Account.Builder builder() {
        return new Account().new Builder();
    }

    public class Builder {

        public Account.Builder clientId(long clientId) {
            Account.this.clientId = clientId;
            return this;
        }

        public Account.Builder id(long id) {
            Account.this.id = id;
            return this;
        }

        public Account.Builder createDate(LocalDate date) {
            Account.this.createDate = date;
            return this;
        }

        public Account.Builder balance(BigDecimal balance) {
            Account.this.balance = balance;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }

    public Account(String accountId) {
        this.accountId = accountId;
    }

    public static final Comparator<Account> COMPARE_BY_BALANCE = Comparator.comparing(Account::getBalance);
}
