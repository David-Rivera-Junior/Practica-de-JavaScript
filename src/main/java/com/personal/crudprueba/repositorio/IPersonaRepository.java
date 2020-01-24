package com.personal.crudprueba.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.crudprueba.entidades.Persona;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona, Integer>{

}
