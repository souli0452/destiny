package com.example.destiny.model;

import com.example.destiny.abstraite.AbstratId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
@Table(name = "signe_zodiaque")
public class SigneZodiaque extends AbstratId {

    @Column(name = "libelle_signe_zodiaque")
    private String libelleSigneZodiaque;

    @Column(name = "description_signe_zodiaque")
    private String descriptionSigneZodiaque;

    @Column(name = "photo_signe_zodiaque")
    private String photoSigneZodiaque;

    @ManyToOne
    private User user;

    @ManyToOne
    private CompatibleSigne compatibleSigne;


}
