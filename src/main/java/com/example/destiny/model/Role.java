package com.example.destiny.model;

import com.example.destiny.abstraite.AbstratId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter
@Table(name = "role")
public class Role extends AbstratId {

    @Column(name = "libelle_role")
    private String libelleRole;
}
