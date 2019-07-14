package com.fornalskiapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fornalskiapp.models.CadastroEvento;

public interface ShowEventoRepository extends CrudRepository<CadastroEvento,String >{
	
}
