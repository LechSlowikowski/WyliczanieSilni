package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/********************************************************
 * nazwa klasy: WyliczanieSilniTest
 * argumenty klasy: brak
 * wartość zwracana: brak
 * opis: Klasa testująca klase Wyliczanie silni
 * autor: 90123456789
 ******************************************************/
class WyliczanieSilniTest {

    /********************************************************
     * nazwa funkcji: setLiczba
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sprawdzenie poprawnego ustawienia liczby
     * autor: 90123456789
     ******************************************************/
    @Test
    void setLiczba() {
        WyliczanieSilni wyliczanieSilniTest = new WyliczanieSilni(5);
        wyliczanieSilniTest.setLiczba(-5);
        Assertions.assertTrue(wyliczanieSilniTest.getLiczba() == 5);
    }

    /********************************************************
     * nazwa funkcji: konstruktorWprowadzonoUjemnaLiczbe
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sprawdzenie poprawnego działania konstruktora
     *       gdy wprowadzono ujemną wartość liczby
     * autor: 90123456789
     ******************************************************/
    @Test
    void konstruktorWprowadzonoUjemnaLiczbe() {
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(-5);
        Assertions.assertTrue(wyliczanieSilni.getLiczba() == 5);
    }

    /********************************************************
     * nazwa funkcji: poprawneWyliczanieSiliniRekurencyjnie
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sprawdzenie poprawnego wyliczania wartości silni
     * autor: 90123456789
     ******************************************************/
    @Test
    void poprawneWyliczanieSiliniRekurencyjnie() {
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(5);
        long wynik = wyliczanieSilni.obliczSilnie(5);
        Assertions.assertEquals(120, wynik);
    }

    /********************************************************
     * nazwa funkcji: poprawnieWyliczanaTablicaSilni
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sprawdzenie poprawnego tablicy wartości silni
     * autor: 90123456789
     ******************************************************/
    @Test
    void poprawnieWyliczanaTablicaSilni() {
        String tablicaWynikowaStr = "[1, 1, 2, 6, 24, 120]";
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(5);
        wyliczanieSilni.obliczKolejneWartosciSilni(5);
        Assertions.assertEquals(tablicaWynikowaStr, wyliczanieSilni.toString());
    }
}