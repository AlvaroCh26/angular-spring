package com.achillcce.springbootbackendapirest.models.service;

import java.util.List;

import com.achillcce.springbootbackendapirest.models.entity.Cliente;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente save(Cliente cliente);

    public void deleteById(Long id);

    public Cliente findById(Long id);

}