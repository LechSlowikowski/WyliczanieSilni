package com.company;

import java.util.Scanner;

/********************************************************
 * nazwa klasy: Main
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: Główna klasa uruchomieniowa
 * autor: 90123456789
 ******************************************************/
public class Main {
    static int liczba;

    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - tablica parametrów przekazywanych podczas uruchomienia
     * wartość zwracana: brak
     * opis: główna metoda uruchomieniowa programu
     * autor: 90123456789
     ******************************************************/
    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą dla, której będziemy liczyć silnię: ");
        liczba = daneWejsciowe.nextByte();
        WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(liczba);
        wyliczanieSilni.obliczSilnie(liczba);
        System.out.println("Silna rekurencyjnie z liczby : " + liczba + " wynosi: " + wyliczanieSilni.getSilnia());
        wyliczanieSilni.obliczKolejneWartosciSilni(liczba);
        System.out.println("Kolejne wartości silni wynoszą: " + wyliczanieSilni.toString());
    }
}
