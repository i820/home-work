package com.sbrf.reboot.atm.cassettes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CassetteTest {

    class OneHundred extends Banknote {
    }

    class OneThousand extends Banknote {
    }

    @Test
    void getCountBanknotes() {
        OneHundred oneHundred = new OneHundred();

        Cassette<OneHundred> cassette = new Cassette<>(new ArrayList<OneHundred>() {{
            add(oneHundred);
//            add(new OneThousand()); //it will not compile
//            add(new Banknote()); //it will not compile
        }});

        Assertions.assertEquals(1, cassette.getCountBanknotes());
    }

    @Test
    void getCountBanknotes1() {
        OneHundred oneHundred = new OneHundred();

        Cassette<OneThousand> cassette = new Cassette<>(new ArrayList<OneThousand>() {{
            add(new OneThousand()); //it will not compile
            add(new OneThousand()); //it will not compile
//            add(new Banknote()); //it will not compile
        }});

        Assertions.assertEquals(2, cassette.getCountBanknotes());
    }
}