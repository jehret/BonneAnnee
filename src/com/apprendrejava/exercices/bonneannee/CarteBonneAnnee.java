package com.apprendrejava.exercices.bonneannee;

public class CarteBonneAnnee extends Carte {

    public CarteBonneAnnee(String destinataire) {
        this.destinataire=destinataire;
    }

    public void souhaiterBonneAnnee() {
        System.out.printf("Bonne Année %s !",this.destinataire);

    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

}

