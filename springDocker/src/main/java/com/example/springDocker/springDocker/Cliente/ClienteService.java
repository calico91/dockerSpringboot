package com.example.springDocker.springDocker.Cliente;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Cliente> consultarClientes() {

        try {
            return clienteRepository.findAll();

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public Cliente consultarClientePorId(Integer id) {

        try {
            Cliente cliente = clienteRepository.findById(id).orElseThrow(

            );
            return cliente;

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public void eliminarCliente(Integer id){
        clienteRepository.deleteById(id);
    }

    public Cliente modificarCliente(Integer id, Cliente cliente) {

        try {
            Cliente clienteBD = clienteRepository.findById(id).orElseThrow();

            cliente.setId(clienteBD.getId());
            return clienteRepository.save(cliente);

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

}
