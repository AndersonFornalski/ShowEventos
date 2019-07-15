package com.fornalskiapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fornalskiapp.models.CadastroEvento;

@Repository
public interface ShowEventoRepository extends CrudRepository<CadastroEvento, Long >{
	CadastroEvento findByCodigo(long codigo);
	
}
