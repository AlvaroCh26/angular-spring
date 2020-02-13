package com.achillcce.springbootbackendapirest.models.dao;

import com.achillcce.springbootbackendapirest.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}