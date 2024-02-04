package com.example.demo.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UcuslarRepository
        extends JpaRepository<Ucuslar, Integer> {
}
