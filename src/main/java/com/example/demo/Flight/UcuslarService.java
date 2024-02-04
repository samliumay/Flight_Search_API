package com.example.demo.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UcuslarService {

    private final UcuslarRepository ucuslarRepository;

    @Autowired
    public UcuslarService(UcuslarRepository ucuslarRepository) {
        this.ucuslarRepository = ucuslarRepository;
    }

    public List<Ucuslar> getUcuslar(){
        System.out.println(ucuslarRepository.findAll());
        return ucuslarRepository.findAll();
    }
}
