package com.company;

import java.util.Scanner;

public class Main {
    static int liczba;
    public static void main(String[] args) {
	    Scanner daneWejsciowe = new Scanner(System.in);
	    System.out.print("Wprowadź liczbę całkowitą dla, której będziemy liczyć silnię: ");
	    liczba = daneWejsciowe.nextByte();
	    WyliczanieSilni wyliczanieSilni = new WyliczanieSilni(liczba);
	    wyliczanieSilni.obliczSilnie(liczba);
	    System.out.println("Silna rekurencyjnie z liczby : " + liczba + " wynosi: " +wyliczanieSilni.getSilnia());
	    wyliczanieSilni.obliczSilnieIteracyjnie(liczba);
		System.out.println("Silna iteracyjnie z liczby : " + liczba + " wynosi: " +wyliczanieSilni.getSilnia());

		//wyliczanieSilni.obliczKolejneWartosciSilni(liczba);
		wyliczanieSilni.obliczSilnieiWstawDoTablicy(liczba);
		System.out.println("Kolejne wartości silni wynoszą: " + wyliczanieSilni.toString());
    }
}
