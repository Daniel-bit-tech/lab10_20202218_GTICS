package com.example.lab10.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Practicante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_completo;
    private String carrera;
    private String universidad;
    private String email;
    private String pais;
    private String estado;

}
