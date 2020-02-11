package com.example.p4_watre_loic.réu;

import java.util.Objects;

import androidx.annotation.Nullable;

public class Reu {

    private String name;
    private String heure;
    private String lieu;
    private String email;

    public Reu(String name, String heure, String lieu, String email) {
        this.name = name;
        this.heure = heure;
        this.lieu = lieu;
        this.email = email;
    }

    // --- GETTERS ---

    public String getName() {
        return name;
    }
    public String getHeure() {
        return heure;
    }

    public String getLieu() {
        return lieu;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Reu)) return false;
        return (((Reu) obj).email == this.email && ((Reu) obj).lieu == this.lieu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lieu, email);
    }
}