package com.example.springDocker.springDocker.Cliente;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("id_cliente"))
    private Integer id;
    @Column(nullable = false, length = 50)
    private String nombres;
    @Column(nullable = false, length = 50)
    private String apellidos;
    @Column(nullable = false)
    @Size(min = 10, max = 10, message = "el numero celular debe tener 10 caracteres")
    private String celular;
    @Column(length = 30)
    private String pais;
    @Column(unique = true, nullable = false, length = 20)
    private String cedula;
}
