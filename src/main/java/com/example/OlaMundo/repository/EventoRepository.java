package com.example.OlaMundo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.OlaMundo.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long codigo);
}
