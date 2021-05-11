package com.contatos.teste.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.contatos.teste.model.model;

public interface repository extends JpaRepository<model, Long>{

}
