package com.example.demo.servicios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Registro2;

@Repository
public interface RegistroService2 extends JpaRepository<Registro2,Long> {	
	
	@Query(value="SELECT registro.id, identificacion, nombres, apellidos, correo, movil, direccion, nombre_municipio FROM registro INNER JOIN municipio ON registro.municipio_id=municipio.id WHERE identificacion=(?1) ",nativeQuery=true)
	public List<Registro2> search(Long identificacion);

}
