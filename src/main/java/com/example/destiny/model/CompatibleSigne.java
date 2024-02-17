package com.example.destiny.model;

import com.example.destiny.abstraite.AbstratId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
@Table(name = "compatible_signe")
public class CompatibleSigne extends AbstratId {

    @Column(name = "libelle_compatible_signe")
    private String libelleCompatibleSigne;

    @Column(name = "present")
    private double present;

    @OneToMany
    private List<CompatibleSigne> compatibleSignes;
}
