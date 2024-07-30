package utilitaire;

import objet.*;
import java.util.*;
import annotation.*;

public class Util {
    public Vector<String> getAllAnnotation() { //Tous les annotations des classes
        Personne personne = new Personne();
        Voiture voiture = new Voiture();
        Vector<String> allAnnnotation = new Vector<>();
        allAnnnotation.add( "Nom de la classe = " + personne.getClass().getName() + "; Annotation = " + personne.getClass().getAnnotation(Classer.class).nom());
        for ( int i = 0; i < personne.getClass().getDeclaredFields().length; i++) {
            allAnnnotation.add( "Nom de l'attribut = " + personne.getClass().getDeclaredFields()[i].getName() + "; Annotation = " + personne.getClass().getDeclaredFields()[i].getAnnotation(Attribuer.class).name());
        }
        
        allAnnnotation.add( "Nom de la classe = " + voiture.getClass().getName() + "; Annotation = " + voiture.getClass().getAnnotation(Classer.class).nom());
        for ( int i = 0; i < voiture.getClass().getDeclaredFields().length; i++) {
            allAnnnotation.add( "Nom de l'attribut = " + voiture.getClass().getDeclaredFields()[i].getName() + "; Annotation = " + voiture.getClass().getDeclaredFields()[i].getAnnotation(Attribuer.class).name());
        }

        return allAnnnotation;
    }
}
