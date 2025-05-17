package com.example.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Respaldo;
import com.example.service.RespaldoService;

@RestController
@RequestMapping("/api/respaldo")

public class RespaldoController {
    @Autowired
    private RespaldoService respaldoService;

    // @Autowired

    @GetMapping
    public ResponseEntity<List<Respaldo>> getRespaldo(){
        List<Respaldo> respaldo = respaldoService.listaRespaldo;
        if(respaldo.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(respaldo,HttpStatus.OK);
    }

}
