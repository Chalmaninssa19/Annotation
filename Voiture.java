package objet;

import annotation.*;

@Classer(nom = "tobily")
public class Voiture {
    @Attribuer(name = "anarana")
    String nom;
    @Attribuer(name = "numero")
    String num;
    @Attribuer(name = "vidiny")
    double prix;

///Getters et setters
    public String getNom() { return this.nom; }
    public String getNum() { return this.num; }
    public double getPrix() { return this.prix; }
    public void setNom(String nom) { this.nom = nom; }
    public void setNum(String num) { this.num = num; }
    public void setNom(double prix) { this.prix = prix; }

    
}
