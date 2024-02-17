package com.example.destiny.model;

import com.example.destiny.abstraite.AbstratId;
import com.example.destiny.enumeration.GenreEnumSexe;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
@Table(name = "utilisateur")
public class User extends AbstratId {


    @Pattern(regexp = "^[a-zA-Z]+$" , message = "le nom doit contenir uniquement des caracteres")
    @Column(name = "nom", nullable = false)
    private String nom;

    @Pattern(regexp = "^[a-zA-Z]+$" , message = "le prenom doit contenir uniquement des caracteres")
    @Column(name = "prenom")
    private String prenom;

    @Column(name = "sexe")
    private GenreEnumSexe sexe;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "telephone")
    private String telephone;

    @Email
    @Column(name = "email")
    private String mail;

    @Column(name = "pays")
    private String pays;

    @Column(name = "ville")
    private String ville;

    @Column(name = "photo")
    private String photo;

    @Column(name = "quartier")
    private String quartier;

    @Column(name = "description")
    private String description;

    @Column(name = "date_naissance")
    private String dateDeNaissance;

    @Column(name = "date_creation_compte")
    private String dateCreationCompte;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "mot_de_passe")
    private String motDePasse;

    @OneToMany
    private List<SigneZodiaque> signeZodiaques;

    @OneToOne
    private Role role;
}
