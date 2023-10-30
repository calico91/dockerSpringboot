package com.example.springDocker.springDocker.Cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping("/pruebaConexion")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> pruebaConexion() {
        return ResponseEntity.ok().body("conexion establecida");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok().body(clienteService.crearCliente(cliente));
    }

    @GetMapping("/consultar-clientes")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Cliente>> consultarClientes() {
        return ResponseEntity.ok().body(clienteService.consultarClientes());
    }

}
