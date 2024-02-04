package com.example.demo.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HavaalaniRepository
        extends JpaRepository<Havaalani, Integer> {


}
