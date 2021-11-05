package com.sbrf.reboot.utils;


import com.sbrf.reboot.dto.lesson7.Account;

import java.util.Collections;
import java.util.List;

public class AccountUtils {

    public static void sortedById(List<Account> accounts) {
        Collections.sort(accounts, Account.COMPARE_BY_ID);
    }

    public static void sortedByIdDate(List<Account> accounts) {
        Collections.sort(accounts, Account.COMPARE_BY_ID_DATE);
    }
}
