package com.example.destiny.repository;

import com.example.destiny.model.SigneZodiaque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SigneZodiaqueRepository extends JpaRepository<SigneZodiaque, UUID> {
}
