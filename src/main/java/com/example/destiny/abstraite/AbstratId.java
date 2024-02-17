package com.example.destiny.abstraite;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@MappedSuperclass
public class AbstratId {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    protected UUID id;
}
