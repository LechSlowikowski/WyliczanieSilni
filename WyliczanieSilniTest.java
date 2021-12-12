package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WyliczanieSilniTest {

    @Test
    void setLiczba() {
        WyliczanieSilni wyliczanieSilniTest = new WyliczanieSilni(5);
        wyliczanieSilniTest.setLiczba(-5);
        Assertions.assertTrue(wyliczanieSilniTest.getLiczba() == 5);
    }

    @Test
    void konstruktorWprowadzonoUjemnaLiczbe() {
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(-5);
        Assertions.assertTrue(wyliczanieSilni.getLiczba() == 5);
    }

    @Test
    void poprawneWyliczanieSiliniRekurencyjnie() {
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(5);
        long wynik = wyliczanieSilni.obliczSilnie(5);
        Assertions.assertEquals(120, wynik);
    }

    @Test
    void poprawneWyliczanieSilniIteracyjnie () {
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(5);
        long wynik = wyliczanieSilni.obliczSilnieIteracyjnie(5);
        Assertions.assertEquals(120, wynik);
    }
}