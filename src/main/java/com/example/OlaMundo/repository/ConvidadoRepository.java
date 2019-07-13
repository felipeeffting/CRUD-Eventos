package com.example.OlaMundo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.OlaMundo.models.Convidado;
import com.example.OlaMundo.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
	
}
