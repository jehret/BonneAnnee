package com.apprendrejava.exercices.bonneannee;

import java.util.Objects;

public abstract class Carte {
    String destinataire;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return Objects.equals(destinataire, carte.destinataire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getClass().getName());
    }
}
