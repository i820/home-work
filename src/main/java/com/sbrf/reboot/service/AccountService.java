package com.sbrf.reboot.service;

import com.sbrf.reboot.dto.Account;
import com.sbrf.reboot.repository.AccountRepository;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean isAccountExist(long clientId, Account account) {
        Set<Account> accounts = accountRepository.getAllAccountsByClientId(clientId);
        return accounts.contains(account);
    }

    public Account getMaxAccountBalance(long clientId) {
        Set<Account> accounts = accountRepository.getAllAccountsByClientId(clientId);
        return accounts.stream().max(Account.COMPARE_BY_BALANCE).get();
    }

    public Set<Account> getAllAccountsByDateMoreThen(long clientId, LocalDate date) {
        Set<Account> accounts = accountRepository.getAllAccountsByClientId(clientId);
        return accounts.stream().filter(x->x.getCreateDate().isAfter(date)).collect(Collectors.toSet());
    }
}
