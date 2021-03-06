package com.redeSocial.graminsta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redeSocial.graminsta.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}