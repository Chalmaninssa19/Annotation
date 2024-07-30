package objet;

import annotation.*;

@Classer(nom = "olona")
public class Personne {
    @Attribuer(name = "anarana")
    String name;
    @Attribuer(name = "taona")
    int age;

///Getters et setters 
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}
