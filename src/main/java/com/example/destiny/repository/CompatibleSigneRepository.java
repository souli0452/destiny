package com.example.destiny.repository;

import com.example.destiny.model.CompatibleSigne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompatibleSigneRepository extends JpaRepository<CompatibleSigne, UUID> {
}
