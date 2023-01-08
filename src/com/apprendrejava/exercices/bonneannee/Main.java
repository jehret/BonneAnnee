package com.apprendrejava.exercices.bonneannee;

public class Main {

    public static void main(String[] args) {
        GrandParent gp = new GrandParent();

        CarteAnniversaire ca = new CarteAnniversaire("Robert");

        CarteBonneAnnee cba = new CarteBonneAnnee("Robert");

        gp.souhaiterEvenement(cba);
        gp.souhaiterEvenement(ca);

        CarteAnniversaire ca2 = new CarteAnniversaire("Robert");

        gp.souhaiterEvenement(ca2);

    }
}
