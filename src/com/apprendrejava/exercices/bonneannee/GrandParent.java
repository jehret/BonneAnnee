package com.apprendrejava.exercices.bonneannee;

import java.util.HashSet;
import java.util.Set;

public class GrandParent {

    private final Set<Carte> listeDeCarte=new HashSet<>();

    public void souhaiterEvenement(Carte carte)
    {
        if(listeDeCarte.add(carte))
        {
            switch (carte)
            {
                case CarteAnniversaire c ->  c.souhaiterAnniversaire();
                case CarteBonneAnnee c-> c.souhaiterBonneAnnee();
                default -> throw new IllegalStateException("Le type de Carte est inconnu: " + carte.getClass().getName());
            }
        }
        else
        {
            System.out.println("Je ne peux pas renvoyer la même carte!");
        }
    }
}
