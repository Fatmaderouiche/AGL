/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatma
 */
public class Article {
    private String id;
    private String nom;
    private double prix;

public Article(String id, String nom, double prix) {
        this.id= id;
        this.nom = nom;
        this.prix = prix ;
}
public String getid() {
        return id;
    }
public String getnom() {
        return nom;
}
public double getprix() {
        return prix;
}
public void setid (String id) {
        this.id = id;
}
public void setnom (String nom) {
        this.nom = nom;
}
public double setprix (double prix) {
        this.prix = prix;
        return 0;
}
public void afficherInfos() {
        System.out.println("id de l'article : " + id);
        System.out.println("nom de l'article : " + nom);
        System.out.println("Prix : " + prix + " dt");
}
}

