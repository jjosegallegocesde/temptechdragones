package com.example.casaDragon.repositorios;

import com.example.casaDragon.models.Aliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliadoRepositorio extends JpaRepository<Aliado, Integer> {
}
