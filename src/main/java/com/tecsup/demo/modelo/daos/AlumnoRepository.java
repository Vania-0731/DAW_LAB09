package com.tecsup.demo.modelo.daos;

import com.tecsup.demo.modelo.entidades.Alumno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    List<Alumno> findByNombreContainingIgnoreCase(String nombre);
}
