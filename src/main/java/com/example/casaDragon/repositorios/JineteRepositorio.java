package com.example.casaDragon.repositorios;

import com.example.casaDragon.models.Jinete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JineteRepositorio extends JpaRepository<Jinete, Integer> {
}
