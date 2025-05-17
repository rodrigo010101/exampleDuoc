package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.model.Respaldo;
import com.example.repository.RespaldoRepository;
import java.time.LocalDateTime;
import java.util.Optional;

// anotaciones @Repository
// metodos crear,buscar,eliminar,actualizar

@Service

public class RespaldoService {
    @Autowired
    private RespaldoRepository respaldoRepository;

    public ArrayList<Respaldo> listaRespaldo = new ArrayList<>();

    // private List<Respaldo> listRespaldos = new ArrayList<>();

    public Respaldo crearRespaldo(Respaldo respaldo) {
        respaldo.setFechaInicio(LocalDateTime.now());
        respaldo.setFechaTermino(LocalDateTime.now().plusMinutes(5));
        return respaldo;
    }

}
