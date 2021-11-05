package com.sbrf.reboot.dto.lesson7;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;

@Data
@Builder
public class Account {
    private long id;
    private LocalDate createDate;
    private BigDecimal balance;

    public static final Comparator<Account> COMPARE_BY_ID = Comparator.comparingLong(Account::getId);

    public static final Comparator<Account> COMPARE_BY_ID_DATE = Comparator.comparingLong(Account::getId).thenComparing(Account::getCreateDate);


}