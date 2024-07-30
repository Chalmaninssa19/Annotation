package test;

import annotation.*;

@Classer(nom = "testerClass")
public class Test {
    @Attribuer(name = "tester")
    String nom;

///Getters et setters
    public String getNom() { return this.nom; }
    public void setNom(String nom) { this.nom = nom; }
}