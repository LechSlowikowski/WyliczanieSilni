package com.company;

import java.util.Arrays;

/********************************************************
 * nazwa klasy: WyliczanieSilni
 * argumenty klasy: liczba - liczba, dla której będziemy liczyć silnię
 *                  silnia - obliczna wartość silnii
 *                  tablica - tablica z kolejnymi wartościami silnii od 1 do liczba
 * wartość zwracana: brak
 * opis: Klasa obliczająca silnię
 * autor: 90123456789
 ******************************************************/
public class WyliczanieSilni {
    private int liczba;
    private long silnia;
    long[] tablicaSilni;

    /********************************************************
     * nazwa funkcji: WyliczanieSilni
     * parametry wejściowe: liczba - liczba, dla której obliczamy silnię
     * wartość zwracana: brak
     * opis: konstruktor klasy WyliczanieSilni
     * autor: 90123456789
     ******************************************************/
    public WyliczanieSilni(int liczba) {
        //if(liczba<0) liczba = -liczba;
        liczba = Math.abs(liczba);
        this.liczba = liczba;
        tablicaSilni = new long[liczba + 1];
    }

    /********************************************************
     * nazwa funkcji: obliczSilnie
     * parametry wejściowe: n - liczba, dla której obliczamy silnię
     * wartość zwracana: wartosć silni
     * opis: metoda obliczająca silnię w sposób rekurencyjny
     * autor: 90123456789
     ******************************************************/
    public long obliczSilnie(int n) {
        if (n == 0) {
            silnia = 1;
            return silnia;
        } else {
            silnia = obliczSilnie(n - 1) * n;
            return silnia;
        }
    }

    /********************************************************
     * nazwa funkcji: obliczKolejneWartosciSilni
     * parametry wejściowe: liczba - liczba, dla której obliczamy kolejne wartości silni
     * wartość zwracana: brak
     * opis: metoda obliczająca silnię dla kolejnych liczb od 0 do liczba
     *       i zapisująca wartości w tablicy tablicaSilni
     * autor: 90123456789
     ******************************************************/
    public void obliczKolejneWartosciSilni(int liczba) {
        for (int i = 0; i <= liczba; i++) {
            tablicaSilni[i] = obliczSilnie(i);
        }
    }

    /********************************************************
     * nazwa funkcji: getLiczba
     * parametry wejściowe: brak
     * wartość zwracana: zwraca liczbę, dla której obliczamy silnię
     * opis: metoda zwracająca liczbę, dla której obliczamy silnię
     * autor: 90123456789
     ******************************************************/
    public int getLiczba() {
        return liczba;
    }

    /********************************************************
     * nazwa funkcji: setLiczba
     * parametry wejściowe: liczba, dla której obliczamy silnię
     * wartość zwracana: brak
     * opis: ustawia liczbę, dla której obliczamy silnię
     * autor: 90123456789
     ******************************************************/
    public void setLiczba(int liczba) {
        if (liczba < 0) liczba = -liczba;
        this.liczba = liczba;
    }

    /********************************************************
     * nazwa funkcji: getSilnia
     * parametry wejściowe: brak
     * wartość zwracana: zwraca wartość obliczonej silni
     * opis: metoda zwracająca wartość obliczonej silni
     * autor: 90123456789
     ******************************************************/
    public long getSilnia() {
        return silnia;
    }

    /********************************************************
     * nazwa funkcji: tostring
     * parametry wejściowe: brak
     * wartość zwracana: zawartość tablicy z kolejnymi
     *                   wartościami silni w postaci napisu
     * opis: metoda zwracająca zawartość tablicy z kolejnymi
     *       wartościami silni w postaci napisu
     * autor: 90123456789
     ******************************************************/
    @Override
    public String toString() {
        return Arrays.toString(tablicaSilni);
    }
}
