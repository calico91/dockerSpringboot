package com.example.springDocker.springDocker.Cliente;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public Cliente crearCliente(Cliente cliente) {

        try {
            return clienteRepository.save(cliente);

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}