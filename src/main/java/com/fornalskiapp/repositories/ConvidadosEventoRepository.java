package com.fornalskiapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fornalskiapp.models.ConvidadosEvento;

@Repository
public interface ConvidadosEventoRepository extends CrudRepository<ConvidadosEvento, Long >{
	
}
