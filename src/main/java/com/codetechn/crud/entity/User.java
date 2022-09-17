package com.codetechn.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nom")
     private String nom;
    @Column(name = "email")
     private String email;
    @Column(name = "numero")
     private String numero;

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public User(int id, String nom, String email, String numero) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.numero = numero;
    }
}
