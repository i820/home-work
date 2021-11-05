package com.sbrf.reboot;

import com.sbrf.reboot.dto.Account;
import com.sbrf.reboot.repository.AccountRepositoryImpl;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl("src/main/resources/Accounts.txt");
        Set<Account> set = accountRepository.getAllAccountsByClientId(1);
        System.out.println(set.toString());


    }
}
