package com.arquitectura.modelocapas.model;

// CAPA MODELO - ENTIDAD

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Definición de la clase como una ENTIDAD
@AllArgsConstructor // Generación de un constructor con sus propiedad
@NoArgsConstructor  // Generación de un constructor vacio
@Data // Generación de sus accesos
@Table(name = "usuarios") // Asignación de un nombre a la entidad - tabla
public class Usuario {

    @Id // Identificador del modelo - entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id - autoincrementable
    private Long id;
    @Column(length = 50, nullable = false) // Restricciones del modelo - entidad
    private String nombre;
    @Column(length = 50, nullable = false)
    private String apellido;
    @Column(length = 40, nullable = false, unique = true)
    private String correo;

}
