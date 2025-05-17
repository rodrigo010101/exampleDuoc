package com.example.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

// initial entry automatic
@Data // getter and setter , toString ,hascode
@AllArgsConstructor // genera con parametros
@NoArgsConstructor // genera sin parametros
@Table(name = "Respaldo")
@Entity

public class Respaldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idRespaldo;
    LocalDateTime fechaInicio = LocalDateTime.now();
    LocalDateTime fechaTermino = LocalDateTime.now();
    private String estado;
    private long tamanoByte;

}
