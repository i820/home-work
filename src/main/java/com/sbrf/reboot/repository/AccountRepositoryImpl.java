package com.sbrf.reboot.repository;

import com.sbrf.reboot.dto.Account;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class AccountRepositoryImpl implements AccountRepository {

    String fileName;

    public AccountRepositoryImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Set<Account> getAllAccountsByClientId(long id) throws FileNotFoundException {
        Set<Account> set = new HashSet<>();

            File initialFile = new File(this.fileName);
            InputStream targetStream = new FileInputStream(initialFile);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(targetStream, "UTF-8"));
            String nextLine;
            while ((nextLine = reader.readLine()) != null) {
                if (nextLine.contains("clientId")) {
                    long clientId = Long.parseLong(nextLine.substring(nextLine.indexOf(':') + 2, nextLine.length() - 1));
                    if (clientId == id) {
                        nextLine = reader.readLine();
                        String clientNumber = nextLine.substring(nextLine.indexOf(':') + 3, nextLine.length() - 1);
                        Account account = new Account(clientId, clientNumber);
                        set.add(account);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return set;
    }
}
