package com.example.projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto01.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {


}
