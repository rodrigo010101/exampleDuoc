package com.example.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Respaldo;

@Repository

public class RespaldoRepository extends JPARepository<Respaldo, Integer> {

    private ArrayList<Respaldo> listRespaldos = new ArrayList<>();

}
