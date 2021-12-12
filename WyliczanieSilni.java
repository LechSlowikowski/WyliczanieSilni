package com.company;

import java.util.Arrays;

public class WyliczanieSilni {
    private int liczba;
    private long silnia;
    long[] tablicaSilni;

    public WyliczanieSilni(int liczba) {
        //if(liczba<0) liczba = -liczba;
        liczba = Math.abs(liczba);
        this.liczba = liczba;
        tablicaSilni = new long[liczba+1];
    }

    public long obliczSilnie(int n){
        if(n==0){
            silnia = 1;
            return silnia;
        } else{
            silnia = obliczSilnie(n-1) * n;
            return silnia;
        }
    }

    public long obliczSilnieiWstawDoTablicy(int n){
        if(n==0){
            silnia = 1;
            tablicaSilni[n] = silnia;
            return silnia;
        } else{
            silnia = obliczSilnieiWstawDoTablicy(n-1) * n;
            tablicaSilni[n] = silnia;
            return silnia;
        }
    }

    public long obliczSilnieIteracyjnie(int n){
        long wynik = 1;
        for (int i = 1; i <= n ; i++) {
            wynik = wynik * i;
        }
        silnia = wynik;
        return wynik;
    }

    public void obliczKolejneWartosciSilni(int liczba){
        for (int i = 0; i <= liczba ; i++) {
            tablicaSilni[i] = obliczSilnie(i);
        }
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        if(liczba<0) liczba = -liczba;
        this.liczba = liczba;
    }

    public long getSilnia() {
        return silnia;
    }

    @Override
    public String toString() {
        return Arrays.toString(tablicaSilni);
    }
}
