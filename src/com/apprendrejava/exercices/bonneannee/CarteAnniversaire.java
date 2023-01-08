package com.apprendrejava.exercices.bonneannee;

import java.util.Objects;

public class CarteAnniversaire extends Carte {

    public CarteAnniversaire(String destinataire) {
        this.destinataire=destinataire;
    }

    public void souhaiterAnniversaire() {
        System.out.printf("Joyeux Anniversaire %s !",this.destinataire);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getClass().getName());
    }
}
