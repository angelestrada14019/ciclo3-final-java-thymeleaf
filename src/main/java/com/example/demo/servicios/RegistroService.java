package com.example.demo.servicios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Registro;
import com.example.demo.entidades.Registro2;

@Repository
public interface RegistroService extends JpaRepository<Registro,Long> {		

}
