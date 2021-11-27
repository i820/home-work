package com.sbrf.reboot.atm.cassettes;

import java.util.ArrayList;

public class Cassette<T> {

    ArrayList<T> banknotes;

    public Cassette(ArrayList<T> banknotes) {
        this.banknotes = banknotes;
    }

    public int getCountBanknotes() {
        return banknotes.size();
    }
}
